// source: axelar/evm/v1beta1/events.proto
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

goog.provide('proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.vote.exported.v1beta1.PollParticipants');

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
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.displayName = 'proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted';
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
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.toObject = function(includeInstance, msg) {
  var f, obj = {
    chain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    txId: msg.getTxId_asB64(),
    gatewayAddress: msg.getGatewayAddress_asB64(),
    confirmationHeight: jspb.Message.getFieldWithDefault(msg, 4, 0),
    participants: (f = msg.getParticipants()) && proto.axelar.vote.exported.v1beta1.PollParticipants.toObject(includeInstance, f)
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
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted;
  return proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setTxId(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setGatewayAddress(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setConfirmationHeight(value);
      break;
    case 5:
      var value = new proto.axelar.vote.exported.v1beta1.PollParticipants;
      reader.readMessage(value,proto.axelar.vote.exported.v1beta1.PollParticipants.deserializeBinaryFromReader);
      msg.setParticipants(value);
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
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTxId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getGatewayAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getConfirmationHeight();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getParticipants();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.axelar.vote.exported.v1beta1.PollParticipants.serializeBinaryToWriter
    );
  }
};


/**
 * optional string chain = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes tx_id = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getTxId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes tx_id = 2;
 * This is a type-conversion wrapper around `getTxId()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getTxId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getTxId()));
};


/**
 * optional bytes tx_id = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxId()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getTxId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getTxId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.setTxId = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes gateway_address = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getGatewayAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes gateway_address = 3;
 * This is a type-conversion wrapper around `getGatewayAddress()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getGatewayAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getGatewayAddress()));
};


/**
 * optional bytes gateway_address = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getGatewayAddress()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getGatewayAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getGatewayAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.setGatewayAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional uint64 confirmation_height = 4;
 * @return {number}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getConfirmationHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.setConfirmationHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional axelar.vote.exported.v1beta1.PollParticipants participants = 5;
 * @return {?proto.axelar.vote.exported.v1beta1.PollParticipants}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.getParticipants = function() {
  return /** @type{?proto.axelar.vote.exported.v1beta1.PollParticipants} */ (
    jspb.Message.getWrapperField(this, proto.axelar.vote.exported.v1beta1.PollParticipants, 5));
};


/**
 * @param {?proto.axelar.vote.exported.v1beta1.PollParticipants|undefined} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
*/
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.setParticipants = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted} returns this
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.clearParticipants = function() {
  return this.setParticipants(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.ConfirmKeyTransferStarted.prototype.hasParticipants = function() {
  return jspb.Message.getField(this, 5) != null;
};


