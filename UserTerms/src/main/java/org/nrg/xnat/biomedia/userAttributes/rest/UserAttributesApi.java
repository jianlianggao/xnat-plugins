/*
 * xnat-workshop-plugin: org.nrg.xnat.workshop.userAttributes.rest.UserAttributesApi
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.biomedia.userAttributes.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.nrg.framework.annotations.XapiRestController;
import org.nrg.xnat.biomedia.userAttributes.entities.UserAttributes;
import org.nrg.xnat.biomedia.userAttributes.preferences.UserAttributesPreferencesBean;
import org.nrg.xnat.biomedia.userAttributes.services.UserAttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Api(description = "XNAT User attributes API")
@XapiRestController
@RequestMapping(value = "/userattributes")
public class UserAttributesApi {
    @Autowired
    public void setUserAttributesService(final UserAttributesService userAttributesService) {
        _userAttributesService = userAttributesService;
    }

    @Autowired
    final void setUserAttributesPreferencesBean(final UserAttributesPreferencesBean preferences) {
        _preferences = preferences;
    }

    @ApiOperation(value = "Returns a list of all User attributes.",
                  notes = "Disregards source system.",
                  response = UserAttributes.class, responseContainer = "List")
    @ApiResponses({@ApiResponse(code = 200, message = "User attributess successfully retrieved."),
                   @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
                   @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<UserAttributes>> getEntities() {
        return new ResponseEntity<>(_userAttributesService.getAll(), HttpStatus.OK);
    }

    @ApiOperation(value = "Creates a new User attributes.",
                  notes = "Disregards source system.",
                  response = UserAttributes.class)
    @ApiResponses({@ApiResponse(code = 200, message = "User attributes successfully created."),
                   @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
                   @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public ResponseEntity<UserAttributes> createEntity(@RequestBody final UserAttributes entity) {
        final UserAttributes created = _userAttributesService.create(entity);
        return new ResponseEntity<>(created, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieves the indicated User attributes.",
                  notes = "Based on primary key ID, not subject or record ID.",
                  response = UserAttributes.class)
    @ApiResponses({@ApiResponse(code = 200, message = "User attributes successfully retrieved."),
                   @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
                   @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<UserAttributes> getEntity(@PathVariable final Long id) {
        return new ResponseEntity<>(_userAttributesService.retrieve(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Updates the indicated User attributes.",
                  notes = "Based on primary key ID, not subject or record ID.",
                  response = Void.class)
    @ApiResponses({@ApiResponse(code = 200, message = "User attributes successfully updated."),
                   @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
                   @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
    public ResponseEntity<Void> updateEntity(@PathVariable final Long id, @RequestBody final UserAttributes entity) {
        final UserAttributes existing = _userAttributesService.retrieve(id);
        /*existing.setSubjectId(entity.getSubjectId());
        existing.setSource(entity.getSource());*/
        _userAttributesService.update(existing);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes the indicated User attributes.",
                  notes = "Based on primary key ID, not subject or record ID.",
                  response = Void.class)
    @ApiResponses({@ApiResponse(code = 200, message = "User attributes successfully deleted."),
                   @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
                   @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteEntity(@PathVariable final Long id) {
        final UserAttributes existing = _userAttributesService.retrieve(id);
        _userAttributesService.delete(existing);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Returns a list of the source system IDs.", response = String.class, responseContainer = "List")
    @ApiResponses({@ApiResponse(code = 200, message = "Source system IDs successfully retrieved."),
            @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
            @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(value = "sources", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<String>> getSourceIds() {
        return new ResponseEntity<>(_preferences.getSourceSystemIds(), HttpStatus.OK);
    }

    @ApiOperation(value = "Sets the submitted source system IDs.",
            response = Void.class)
    @ApiResponses({@ApiResponse(code = 200, message = "Source system IDs successfully created."),
            @ApiResponse(code = 401, message = "Must be authenticated to access the XNAT REST API."),
            @ApiResponse(code = 500, message = "Unexpected error")})
    @RequestMapping(value = "sources", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public ResponseEntity<Void> setSourceIds(@RequestBody final List<String> sourceIds) {
        _preferences.setSourceSystemIds(sourceIds);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private UserAttributesService         _userAttributesService;
    private UserAttributesPreferencesBean _preferences;
}
