// source: gravity/v1/pool.proto
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

goog.provide('proto.gravity.v1.EventWithdrawalReceived');

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
proto.gravity.v1.EventWithdrawalReceived = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.gravity.v1.EventWithdrawalReceived, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gravity.v1.EventWithdrawalReceived.displayName = 'proto.gravity.v1.EventWithdrawalReceived';
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
proto.gravity.v1.EventWithdrawalReceived.prototype.toObject = function(opt_includeInstance) {
  return proto.gravity.v1.EventWithdrawalReceived.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gravity.v1.EventWithdrawalReceived} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.EventWithdrawalReceived.toObject = function(includeInstance, msg) {
  var f, obj = {
    bridgeContract: jspb.Message.getFieldWithDefault(msg, 1, ""),
    bridgeChainId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    outgoingTxId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    nonce: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.gravity.v1.EventWithdrawalReceived}
 */
proto.gravity.v1.EventWithdrawalReceived.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gravity.v1.EventWithdrawalReceived;
  return proto.gravity.v1.EventWithdrawalReceived.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gravity.v1.EventWithdrawalReceived} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gravity.v1.EventWithdrawalReceived}
 */
proto.gravity.v1.EventWithdrawalReceived.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBridgeContract(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBridgeChainId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOutgoingTxId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNonce(value);
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
proto.gravity.v1.EventWithdrawalReceived.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gravity.v1.EventWithdrawalReceived.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gravity.v1.EventWithdrawalReceived} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.EventWithdrawalReceived.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBridgeContract();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBridgeChainId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOutgoingTxId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNonce();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string bridge_contract = 1;
 * @return {string}
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.getBridgeContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gravity.v1.EventWithdrawalReceived} returns this
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.setBridgeContract = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string bridge_chain_id = 2;
 * @return {string}
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.getBridgeChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.gravity.v1.EventWithdrawalReceived} returns this
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.setBridgeChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string outgoing_tx_id = 3;
 * @return {string}
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.getOutgoingTxId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.gravity.v1.EventWithdrawalReceived} returns this
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.setOutgoingTxId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string nonce = 4;
 * @return {string}
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.getNonce = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.gravity.v1.EventWithdrawalReceived} returns this
 */
proto.gravity.v1.EventWithdrawalReceived.prototype.setNonce = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


