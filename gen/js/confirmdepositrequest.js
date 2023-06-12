// source: axelar/evm/v1beta1/tx.proto
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

goog.provide('proto.axelar.evm.v1beta1.ConfirmDepositRequest');

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
proto.axelar.evm.v1beta1.ConfirmDepositRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.ConfirmDepositRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.ConfirmDepositRequest.displayName = 'proto.axelar.evm.v1beta1.ConfirmDepositRequest';
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
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.ConfirmDepositRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    chain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    txId: msg.getTxId_asB64(),
    amount: msg.getAmount_asB64(),
    burnerAddress: msg.getBurnerAddress_asB64()
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
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.ConfirmDepositRequest;
  return proto.axelar.evm.v1beta1.ConfirmDepositRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setTxId(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAmount(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBurnerAddress(value);
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
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.ConfirmDepositRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTxId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getAmount_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getBurnerAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getSender_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSender()));
};


/**
 * optional bytes sender = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSender()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional string chain = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes tx_id = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getTxId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes tx_id = 3;
 * This is a type-conversion wrapper around `getTxId()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getTxId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getTxId()));
};


/**
 * optional bytes tx_id = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxId()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getTxId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getTxId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.setTxId = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional bytes amount = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes amount = 4;
 * This is a type-conversion wrapper around `getAmount()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getAmount_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAmount()));
};


/**
 * optional bytes amount = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAmount()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getAmount_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAmount()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.setAmount = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional bytes burner_address = 5;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getBurnerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes burner_address = 5;
 * This is a type-conversion wrapper around `getBurnerAddress()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getBurnerAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBurnerAddress()));
};


/**
 * optional bytes burner_address = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBurnerAddress()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.getBurnerAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBurnerAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmDepositRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmDepositRequest.prototype.setBurnerAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


