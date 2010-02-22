package org.mondemand;

import java.io.Serializable;

/**
 * This represents the various logging levels in MonDemand
 * @author Michael Lum
 */
public class Level implements Serializable {

	/**
	 * textual representation
	 */
	public final static String STRINGS[] = { "emerg", "alert", "crit",
		"error", "warning", "notice", "info", "debug", "all" };	
	
	/**
	 * all off
	 */
	public final static int OFF = -1;
	
	/**
	 * Default emergency priority value for the Logger
	 */
	public final static int EMERG = 0;

	/**
	 * Default alert priority value for the Logger
	 */
	public final static int ALERT = 1;

	/**
	 * Default critical priority value for the Logger
	 */
	public final static int CRIT = 2;

	/**
	 * Default error priority value for the Logger
	 */
	public final static int ERROR = 3;

	/**
	 * Default warning priority value for the Logger
	 */
	public final static int WARNING = 4;

	/**
	 * Default notice priority value for the Logger
	 */
	public final static int NOTICE = 5;

	/**
	 * Default info priority value for the Logger
	 */
	public final static int INFO = 6;

	/**
	 * Default debug priority value for the Logger
	 */
	public final static int DEBUG = 7;

	/**
	 * Default value to send all messages for the Logger
	 */
	public final static int ALL = 8;	
	
}