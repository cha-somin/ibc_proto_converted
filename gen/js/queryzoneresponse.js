// source: quicksilver/interchainstaking/v1/query.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.quicksilver.interchainstaking.v1.QueryZoneResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.interchainstaking.v1.Statistics');
goog.require('proto.quicksilver.interchainstaking.v1.Zone');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quicksilver.interchainstaking.v1.QueryZoneResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainstaking.v1.QueryZoneResponse.displayName = 'proto.quicksilver.interchainstaking.v1.QueryZoneResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainstaking.v1.QueryZoneResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    zone: (f = msg.getZone()) && proto.quicksilver.interchainstaking.v1.Zone.toObject(includeInstance, f),
    stats: (f = msg.getStats()) && proto.quicksilver.interchainstaking.v1.Statistics.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainstaking.v1.QueryZoneResponse;
  return proto.quicksilver.interchainstaking.v1.QueryZoneResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.quicksilver.interchainstaking.v1.Zone;
      reader.readMessage(value,proto.quicksilver.interchainstaking.v1.Zone.deserializeBinaryFromReader);
      msg.setZone(value);
      break;
    case 2:
      var value = new proto.quicksilver.interchainstaking.v1.Statistics;
      reader.readMessage(value,proto.quicksilver.interchainstaking.v1.Statistics.deserializeBinaryFromReader);
      msg.setStats(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainstaking.v1.QueryZoneResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getZone();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.quicksilver.interchainstaking.v1.Zone.serializeBinaryToWriter
    );
  }
  f = message.getStats();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.quicksilver.interchainstaking.v1.Statistics.serializeBinaryToWriter
    );
  }
};


/**
 * optional Zone zone = 1;
 * @return {?proto.quicksilver.interchainstaking.v1.Zone}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.getZone = function() {
  return /** @type{?proto.quicksilver.interchainstaking.v1.Zone} */ (
    jspb.Message.getWrapperField(this, proto.quicksilver.interchainstaking.v1.Zone, 1));
};


/**
 * @param {?proto.quicksilver.interchainstaking.v1.Zone|undefined} value
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} returns this
*/
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.setZone = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} returns this
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.clearZone = function() {
  return this.setZone(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.hasZone = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Statistics stats = 2;
 * @return {?proto.quicksilver.interchainstaking.v1.Statistics}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.getStats = function() {
  return /** @type{?proto.quicksilver.interchainstaking.v1.Statistics} */ (
    jspb.Message.getWrapperField(this, proto.quicksilver.interchainstaking.v1.Statistics, 2));
};


/**
 * @param {?proto.quicksilver.interchainstaking.v1.Statistics|undefined} value
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} returns this
*/
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.setStats = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainstaking.v1.QueryZoneResponse} returns this
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.clearStats = function() {
  return this.setStats(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainstaking.v1.QueryZoneResponse.prototype.hasStats = function() {
  return jspb.Message.getField(this, 2) != null;
};


