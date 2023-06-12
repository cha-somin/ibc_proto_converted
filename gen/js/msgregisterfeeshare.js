// source: juno/feeshare/v1/tx.proto
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

goog.provide('proto.juno.feeshare.v1.MsgRegisterFeeShare');

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
proto.juno.feeshare.v1.MsgRegisterFeeShare = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.juno.feeshare.v1.MsgRegisterFeeShare, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.juno.feeshare.v1.MsgRegisterFeeShare.displayName = 'proto.juno.feeshare.v1.MsgRegisterFeeShare';
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
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.toObject = function(opt_includeInstance) {
  return proto.juno.feeshare.v1.MsgRegisterFeeShare.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.juno.feeshare.v1.MsgRegisterFeeShare} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    deployerAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    withdrawerAddress: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.juno.feeshare.v1.MsgRegisterFeeShare}
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.juno.feeshare.v1.MsgRegisterFeeShare;
  return proto.juno.feeshare.v1.MsgRegisterFeeShare.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.juno.feeshare.v1.MsgRegisterFeeShare} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.juno.feeshare.v1.MsgRegisterFeeShare}
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeployerAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setWithdrawerAddress(value);
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
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.juno.feeshare.v1.MsgRegisterFeeShare.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.juno.feeshare.v1.MsgRegisterFeeShare} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDeployerAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getWithdrawerAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string contract_address = 1;
 * @return {string}
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.juno.feeshare.v1.MsgRegisterFeeShare} returns this
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string deployer_address = 2;
 * @return {string}
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.getDeployerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.juno.feeshare.v1.MsgRegisterFeeShare} returns this
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.setDeployerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string withdrawer_address = 3;
 * @return {string}
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.getWithdrawerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.juno.feeshare.v1.MsgRegisterFeeShare} returns this
 */
proto.juno.feeshare.v1.MsgRegisterFeeShare.prototype.setWithdrawerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


