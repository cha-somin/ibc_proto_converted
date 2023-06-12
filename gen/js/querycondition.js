// source: osmosis/lockup/lock.proto
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

goog.provide('proto.osmosis.lockup.QueryCondition');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.osmosis.lockup.LockQueryType');
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
proto.osmosis.lockup.QueryCondition = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.lockup.QueryCondition, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.lockup.QueryCondition.displayName = 'proto.osmosis.lockup.QueryCondition';
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
proto.osmosis.lockup.QueryCondition.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.lockup.QueryCondition.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.lockup.QueryCondition} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.lockup.QueryCondition.toObject = function(includeInstance, msg) {
  var f, obj = {
    lockQueryType: jspb.Message.getFieldWithDefault(msg, 1, 0),
    denom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.lockup.QueryCondition}
 */
proto.osmosis.lockup.QueryCondition.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.lockup.QueryCondition;
  return proto.osmosis.lockup.QueryCondition.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.lockup.QueryCondition} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.lockup.QueryCondition}
 */
proto.osmosis.lockup.QueryCondition.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.osmosis.lockup.LockQueryType} */ (reader.readEnum());
      msg.setLockQueryType(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimestamp(value);
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
proto.osmosis.lockup.QueryCondition.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.lockup.QueryCondition.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.lockup.QueryCondition} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.lockup.QueryCondition.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLockQueryType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional LockQueryType lock_query_type = 1;
 * @return {!proto.osmosis.lockup.LockQueryType}
 */
proto.osmosis.lockup.QueryCondition.prototype.getLockQueryType = function() {
  return /** @type {!proto.osmosis.lockup.LockQueryType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.osmosis.lockup.LockQueryType} value
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
 */
proto.osmosis.lockup.QueryCondition.prototype.setLockQueryType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string denom = 2;
 * @return {string}
 */
proto.osmosis.lockup.QueryCondition.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
 */
proto.osmosis.lockup.QueryCondition.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Duration duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.osmosis.lockup.QueryCondition.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
*/
proto.osmosis.lockup.QueryCondition.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
 */
proto.osmosis.lockup.QueryCondition.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.lockup.QueryCondition.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Timestamp timestamp = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.osmosis.lockup.QueryCondition.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
*/
proto.osmosis.lockup.QueryCondition.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.lockup.QueryCondition} returns this
 */
proto.osmosis.lockup.QueryCondition.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.lockup.QueryCondition.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 4) != null;
};


