/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * General properties describing a fleet.
 * </p>
 */
public class FleetAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be
     * unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     */
    private String status;
    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * Deprecated. Server launch parameters are now set using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * Deprecated. Server launch parameters are now specified using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon
     * GameLift captures and stores any log files in this location. These logs
     * are in addition to game session logs; see more on game session logs in
     * the <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet
     * is specified, GameLift will automatically upload logs stored on each
     * instance at <code>C:\game\logs</code>. Use the GameLift console to access
     * stored logs.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     */
    private String newGameSessionProtectionPolicy;

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @return Human-readable description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be
     * unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a fleet. Fleet names do not need
     *        to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be
     * unique.
     * </p>
     * 
     * @return Descriptive label associated with a fleet. Fleet names do not
     *         need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be
     * unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a fleet. Fleet names do not need
     *        to be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @return Time stamp indicating when this object was created. Format is an
     *         integer representing the number of seconds since the Unix epoch
     *         (Unix time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this fleet was terminated. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @return Time stamp indicating when this fleet was terminated. Format is
     *         an integer representing the number of seconds since the Unix
     *         epoch (Unix time).
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this fleet was terminated. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the fleet. Possible fleet states include the
     *        following:
     *        <ul>
     *        <li><b>NEW</b> – A new fleet has been defined and desired
     *        instances is set to 1.</li>
     *        <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift
     *        is setting up the new fleet, creating new instances with the game
     *        build and starting server processes.</li>
     *        <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     *        <li><b>ERROR</b> – An error occurred when downloading, validating,
     *        building, or activating the fleet.</li>
     *        <li><b>DELETING</b> – Hosts are responding to a delete fleet
     *        request.</li>
     *        <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     *        </ul>
     * @see FleetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     * 
     * @return Current status of the fleet. Possible fleet states include the
     *         following:
     *         <ul>
     *         <li><b>NEW</b> – A new fleet has been defined and desired
     *         instances is set to 1.</li>
     *         <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift
     *         is setting up the new fleet, creating new instances with the game
     *         build and starting server processes.</li>
     *         <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     *         <li><b>ERROR</b> – An error occurred when downloading,
     *         validating, building, or activating the fleet.</li>
     *         <li><b>DELETING</b> – Hosts are responding to a delete fleet
     *         request.</li>
     *         <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     *         </ul>
     * @see FleetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the fleet. Possible fleet states include the
     *        following:
     *        <ul>
     *        <li><b>NEW</b> – A new fleet has been defined and desired
     *        instances is set to 1.</li>
     *        <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift
     *        is setting up the new fleet, creating new instances with the game
     *        build and starting server processes.</li>
     *        <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     *        <li><b>ERROR</b> – An error occurred when downloading, validating,
     *        building, or activating the fleet.</li>
     *        <li><b>DELETING</b> – Hosts are responding to a delete fleet
     *        request.</li>
     *        <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see FleetStatus
     */

    public FleetAttributes withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the fleet. Possible fleet states include the
     *        following:
     *        <ul>
     *        <li><b>NEW</b> – A new fleet has been defined and desired
     *        instances is set to 1.</li>
     *        <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift
     *        is setting up the new fleet, creating new instances with the game
     *        build and starting server processes.</li>
     *        <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     *        <li><b>ERROR</b> – An error occurred when downloading, validating,
     *        building, or activating the fleet.</li>
     *        <li><b>DELETING</b> – Hosts are responding to a delete fleet
     *        request.</li>
     *        <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     *        </ul>
     * @see FleetStatus
     */

    public void setStatus(FleetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet states include the following:
     * <ul>
     * <li><b>NEW</b> – A new fleet has been defined and desired instances is
     * set to 1.</li>
     * <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift is
     * setting up the new fleet, creating new instances with the game build and
     * starting server processes.</li>
     * <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     * <li><b>ERROR</b> – An error occurred when downloading, validating,
     * building, or activating the fleet.</li>
     * <li><b>DELETING</b> – Hosts are responding to a delete fleet request.</li>
     * <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the fleet. Possible fleet states include the
     *        following:
     *        <ul>
     *        <li><b>NEW</b> – A new fleet has been defined and desired
     *        instances is set to 1.</li>
     *        <li><b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> – GameLift
     *        is setting up the new fleet, creating new instances with the game
     *        build and starting server processes.</li>
     *        <li><b>ACTIVE</b> – Hosts can now accept game sessions.</li>
     *        <li><b>ERROR</b> – An error occurred when downloading, validating,
     *        building, or activating the fleet.</li>
     *        <li><b>DELETING</b> – Hosts are responding to a delete fleet
     *        request.</li>
     *        <li><b>TERMINATED</b> – The fleet no longer exists.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see FleetStatus
     */

    public FleetAttributes withStatus(FleetStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @return Unique identifier for a build.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now set using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @param serverLaunchPath
     *        Deprecated. Server launch parameters are now set using a
     *        <code><a>RuntimeConfiguration</a></code> object.
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now set using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @return Deprecated. Server launch parameters are now set using a
     *         <code><a>RuntimeConfiguration</a></code> object.
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now set using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @param serverLaunchPath
     *        Deprecated. Server launch parameters are now set using a
     *        <code><a>RuntimeConfiguration</a></code> object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now specified using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @param serverLaunchParameters
     *        Deprecated. Server launch parameters are now specified using a
     *        <code><a>RuntimeConfiguration</a></code> object.
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now specified using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @return Deprecated. Server launch parameters are now specified using a
     *         <code><a>RuntimeConfiguration</a></code> object.
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * Deprecated. Server launch parameters are now specified using a
     * <code><a>RuntimeConfiguration</a></code> object.
     * </p>
     * 
     * @param serverLaunchParameters
     *        Deprecated. Server launch parameters are now specified using a
     *        <code><a>RuntimeConfiguration</a></code> object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withServerLaunchParameters(
            String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon
     * GameLift captures and stores any log files in this location. These logs
     * are in addition to game session logs; see more on game session logs in
     * the <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet
     * is specified, GameLift will automatically upload logs stored on each
     * instance at <code>C:\game\logs</code>. Use the GameLift console to access
     * stored logs.
     * </p>
     * 
     * @return Location of default log files. When a server process is shut
     *         down, Amazon GameLift captures and stores any log files in this
     *         location. These logs are in addition to game session logs; see
     *         more on game session logs in the <a href=
     *         "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *         >Amazon GameLift Developer Guide</a>. If no default log path for
     *         a fleet is specified, GameLift will automatically upload logs
     *         stored on each instance at <code>C:\game\logs</code>. Use the
     *         GameLift console to access stored logs.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon
     * GameLift captures and stores any log files in this location. These logs
     * are in addition to game session logs; see more on game session logs in
     * the <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet
     * is specified, GameLift will automatically upload logs stored on each
     * instance at <code>C:\game\logs</code>. Use the GameLift console to access
     * stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down,
     *        Amazon GameLift captures and stores any log files in this
     *        location. These logs are in addition to game session logs; see
     *        more on game session logs in the <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a
     *        fleet is specified, GameLift will automatically upload logs stored
     *        on each instance at <code>C:\game\logs</code>. Use the GameLift
     *        console to access stored logs.
     */

    public void setLogPaths(java.util.Collection<String> logPaths) {
        if (logPaths == null) {
            this.logPaths = null;
            return;
        }

        this.logPaths = new java.util.ArrayList<String>(logPaths);
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon
     * GameLift captures and stores any log files in this location. These logs
     * are in addition to game session logs; see more on game session logs in
     * the <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet
     * is specified, GameLift will automatically upload logs stored on each
     * instance at <code>C:\game\logs</code>. Use the GameLift console to access
     * stored logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLogPaths(java.util.Collection)} or
     * {@link #withLogPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down,
     *        Amazon GameLift captures and stores any log files in this
     *        location. These logs are in addition to game session logs; see
     *        more on game session logs in the <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a
     *        fleet is specified, GameLift will automatically upload logs stored
     *        on each instance at <code>C:\game\logs</code>. Use the GameLift
     *        console to access stored logs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withLogPaths(String... logPaths) {
        if (this.logPaths == null) {
            setLogPaths(new java.util.ArrayList<String>(logPaths.length));
        }
        for (String ele : logPaths) {
            this.logPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon
     * GameLift captures and stores any log files in this location. These logs
     * are in addition to game session logs; see more on game session logs in
     * the <a href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet
     * is specified, GameLift will automatically upload logs stored on each
     * instance at <code>C:\game\logs</code>. Use the GameLift console to access
     * stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down,
     *        Amazon GameLift captures and stores any log files in this
     *        location. These logs are in addition to game session logs; see
     *        more on game session logs in the <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a
     *        fleet is specified, GameLift will automatically upload logs stored
     *        on each instance at <code>C:\game\logs</code>. Use the GameLift
     *        console to access stored logs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FleetAttributes withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances
     *        started in the fleet.
     *        <ul>
     *        <li><b>NoProtection</b> – The game session can be terminated
     *        during a scale-down event.</li>
     *        <li><b>FullProtection</b> – If the game session is in an
     *        <code>ACTIVE</code> status, it cannot be terminated during a
     *        scale-down event.</li>
     *        </ul>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(
            String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     * 
     * @return Type of game session protection to set for all new instances
     *         started in the fleet.
     *         <ul>
     *         <li><b>NoProtection</b> – The game session can be terminated
     *         during a scale-down event.</li>
     *         <li><b>FullProtection</b> – If the game session is in an
     *         <code>ACTIVE</code> status, it cannot be terminated during a
     *         scale-down event.</li>
     *         </ul>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances
     *        started in the fleet.
     *        <ul>
     *        <li><b>NoProtection</b> – The game session can be terminated
     *        during a scale-down event.</li>
     *        <li><b>FullProtection</b> – If the game session is in an
     *        <code>ACTIVE</code> status, it cannot be terminated during a
     *        scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public FleetAttributes withNewGameSessionProtectionPolicy(
            String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances
     *        started in the fleet.
     *        <ul>
     *        <li><b>NoProtection</b> – The game session can be terminated
     *        during a scale-down event.</li>
     *        <li><b>FullProtection</b> – If the game session is in an
     *        <code>ACTIVE</code> status, it cannot be terminated during a
     *        scale-down event.</li>
     *        </ul>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(
            ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy
                .toString();
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in
     * the fleet.
     * <ul>
     * <li><b>NoProtection</b> – The game session can be terminated during a
     * scale-down event.</li>
     * <li><b>FullProtection</b> – If the game session is in an
     * <code>ACTIVE</code> status, it cannot be terminated during a scale-down
     * event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances
     *        started in the fleet.
     *        <ul>
     *        <li><b>NoProtection</b> – The game session can be terminated
     *        during a scale-down event.</li>
     *        <li><b>FullProtection</b> – If the game session is in an
     *        <code>ACTIVE</code> status, it cannot be terminated during a
     *        scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public FleetAttributes withNewGameSessionProtectionPolicy(
            ProtectionPolicy newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: " + getTerminationTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getBuildId() != null)
            sb.append("BuildId: " + getBuildId() + ",");
        if (getServerLaunchPath() != null)
            sb.append("ServerLaunchPath: " + getServerLaunchPath() + ",");
        if (getServerLaunchParameters() != null)
            sb.append("ServerLaunchParameters: " + getServerLaunchParameters()
                    + ",");
        if (getLogPaths() != null)
            sb.append("LogPaths: " + getLogPaths() + ",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: "
                    + getNewGameSessionProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetAttributes == false)
            return false;
        FleetAttributes other = (FleetAttributes) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationTime() == null
                ^ this.getTerminationTime() == null)
            return false;
        if (other.getTerminationTime() != null
                && other.getTerminationTime().equals(this.getTerminationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null
                && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getServerLaunchPath() == null
                ^ this.getServerLaunchPath() == null)
            return false;
        if (other.getServerLaunchPath() != null
                && other.getServerLaunchPath().equals(
                        this.getServerLaunchPath()) == false)
            return false;
        if (other.getServerLaunchParameters() == null
                ^ this.getServerLaunchParameters() == null)
            return false;
        if (other.getServerLaunchParameters() != null
                && other.getServerLaunchParameters().equals(
                        this.getServerLaunchParameters()) == false)
            return false;
        if (other.getLogPaths() == null ^ this.getLogPaths() == null)
            return false;
        if (other.getLogPaths() != null
                && other.getLogPaths().equals(this.getLogPaths()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null
                ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(
                        this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminationTime() == null) ? 0 : getTerminationTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getServerLaunchParameters() == null) ? 0
                        : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode
                + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewGameSessionProtectionPolicy() == null) ? 0
                        : getNewGameSessionProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public FleetAttributes clone() {
        try {
            return (FleetAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
