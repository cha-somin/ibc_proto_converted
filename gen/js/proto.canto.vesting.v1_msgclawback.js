// source: canto/vesting/v1/tx.proto
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

goog.provide('proto.canto.vesting.v1.MsgClawback');

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
proto.canto.vesting.v1.MsgClawback = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.canto.vesting.v1.MsgClawback, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.canto.vesting.v1.MsgClawback.displayName = 'proto.canto.vesting.v1.MsgClawback';
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
proto.canto.vesting.v1.MsgClawback.prototype.toObject = function(opt_includeInstance) {
  return proto.canto.vesting.v1.MsgClawback.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.canto.vesting.v1.MsgClawback} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.vesting.v1.MsgClawback.toObject = function(includeInstance, msg) {
  var f, obj = {
    funderAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    accountAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    destAddress: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.canto.vesting.v1.MsgClawback}
 */
proto.canto.vesting.v1.MsgClawback.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.canto.vesting.v1.MsgClawback;
  return proto.canto.vesting.v1.MsgClawback.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.canto.vesting.v1.MsgClawback} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.canto.vesting.v1.MsgClawback}
 */
proto.canto.vesting.v1.MsgClawback.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFunderAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAccountAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestAddress(value);
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
proto.canto.vesting.v1.MsgClawback.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.canto.vesting.v1.MsgClawback.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.canto.vesting.v1.MsgClawback} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.vesting.v1.MsgClawback.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFunderAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAccountAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDestAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string funder_address = 1;
 * @return {string}
 */
proto.canto.vesting.v1.MsgClawback.prototype.getFunderAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.vesting.v1.MsgClawback} returns this
 */
proto.canto.vesting.v1.MsgClawback.prototype.setFunderAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string account_address = 2;
 * @return {string}
 */
proto.canto.vesting.v1.MsgClawback.prototype.getAccountAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.vesting.v1.MsgClawback} returns this
 */
proto.canto.vesting.v1.MsgClawback.prototype.setAccountAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string dest_address = 3;
 * @return {string}
 */
proto.canto.vesting.v1.MsgClawback.prototype.getDestAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.vesting.v1.MsgClawback} returns this
 */
proto.canto.vesting.v1.MsgClawback.prototype.setDestAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


