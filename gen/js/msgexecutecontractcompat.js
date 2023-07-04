// source: injective/wasmx/v1/tx.proto
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

goog.provide('proto.injective.wasmx.v1.MsgExecuteContractCompat');

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
proto.injective.wasmx.v1.MsgExecuteContractCompat = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.wasmx.v1.MsgExecuteContractCompat, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.wasmx.v1.MsgExecuteContractCompat.displayName = 'proto.injective.wasmx.v1.MsgExecuteContractCompat';
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
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.wasmx.v1.MsgExecuteContractCompat.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.wasmx.v1.MsgExecuteContractCompat} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    contract: jspb.Message.getFieldWithDefault(msg, 2, ""),
    msg: jspb.Message.getFieldWithDefault(msg, 3, ""),
    funds: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.wasmx.v1.MsgExecuteContractCompat;
  return proto.injective.wasmx.v1.MsgExecuteContractCompat.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.wasmx.v1.MsgExecuteContractCompat} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setContract(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMsg(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFunds(value);
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
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.wasmx.v1.MsgExecuteContractCompat.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.wasmx.v1.MsgExecuteContractCompat} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMsg();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getFunds();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat} returns this
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string contract = 2;
 * @return {string}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat} returns this
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string msg = 3;
 * @return {string}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.getMsg = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat} returns this
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.setMsg = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string funds = 4;
 * @return {string}
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.getFunds = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.MsgExecuteContractCompat} returns this
 */
proto.injective.wasmx.v1.MsgExecuteContractCompat.prototype.setFunds = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

