// source: comdex/rewards/v1beta1/rewards.proto
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

goog.provide('proto.comdex.rewards.v1beta1.EpochTime');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.comdex.rewards.v1beta1.EpochTime = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.rewards.v1beta1.EpochTime, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.EpochTime.displayName = 'proto.comdex.rewards.v1beta1.EpochTime';
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
proto.comdex.rewards.v1beta1.EpochTime.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.EpochTime.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.EpochTime} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.EpochTime.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    appMappingId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    startingTime: jspb.Message.getFieldWithDefault(msg, 3, 0),
    count: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.comdex.rewards.v1beta1.EpochTime}
 */
proto.comdex.rewards.v1beta1.EpochTime.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.EpochTime;
  return proto.comdex.rewards.v1beta1.EpochTime.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.EpochTime} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.EpochTime}
 */
proto.comdex.rewards.v1beta1.EpochTime.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppMappingId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setStartingTime(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCount(value);
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
proto.comdex.rewards.v1beta1.EpochTime.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.EpochTime.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.EpochTime} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.EpochTime.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAppMappingId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getStartingTime();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getCount();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.EpochTime} returns this
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 app_mapping_id = 2;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.getAppMappingId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.EpochTime} returns this
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.setAppMappingId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional int64 starting_time = 3;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.getStartingTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.EpochTime} returns this
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.setStartingTime = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 count = 4;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.getCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.EpochTime} returns this
 */
proto.comdex.rewards.v1beta1.EpochTime.prototype.setCount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


