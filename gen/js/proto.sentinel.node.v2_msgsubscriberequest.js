// source: sentinel/node/v2/msg.proto
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

goog.provide('proto.sentinel.node.v2.MsgSubscribeRequest');

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
proto.sentinel.node.v2.MsgSubscribeRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.sentinel.node.v2.MsgSubscribeRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.node.v2.MsgSubscribeRequest.displayName = 'proto.sentinel.node.v2.MsgSubscribeRequest';
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
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.node.v2.MsgSubscribeRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.node.v2.MsgSubscribeRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.node.v2.MsgSubscribeRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    gigabytes: jspb.Message.getFieldWithDefault(msg, 3, 0),
    hours: jspb.Message.getFieldWithDefault(msg, 4, 0),
    denom: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.node.v2.MsgSubscribeRequest;
  return proto.sentinel.node.v2.MsgSubscribeRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.node.v2.MsgSubscribeRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGigabytes(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHours(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
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
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.node.v2.MsgSubscribeRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.node.v2.MsgSubscribeRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.node.v2.MsgSubscribeRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getGigabytes();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getHours();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest} returns this
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest} returns this
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional int64 gigabytes = 3;
 * @return {number}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.getGigabytes = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest} returns this
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.setGigabytes = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional int64 hours = 4;
 * @return {number}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.getHours = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest} returns this
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.setHours = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string denom = 5;
 * @return {string}
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.node.v2.MsgSubscribeRequest} returns this
 */
proto.sentinel.node.v2.MsgSubscribeRequest.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


