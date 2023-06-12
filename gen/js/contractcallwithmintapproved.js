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

goog.provide('proto.axelar.evm.v1beta1.ContractCallWithMintApproved');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.axelar.evm.v1beta1.ContractCallWithMintApproved = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.ContractCallWithMintApproved, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.ContractCallWithMintApproved.displayName = 'proto.axelar.evm.v1beta1.ContractCallWithMintApproved';
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
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.ContractCallWithMintApproved.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.toObject = function(includeInstance, msg) {
  var f, obj = {
    chain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    eventId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    commandId: msg.getCommandId_asB64(),
    sender: jspb.Message.getFieldWithDefault(msg, 4, ""),
    destinationChain: jspb.Message.getFieldWithDefault(msg, 5, ""),
    contractAddress: jspb.Message.getFieldWithDefault(msg, 6, ""),
    payloadHash: msg.getPayloadHash_asB64(),
    asset: (f = msg.getAsset()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.ContractCallWithMintApproved;
  return proto.axelar.evm.v1beta1.ContractCallWithMintApproved.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setEventId(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCommandId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestinationChain(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPayloadHash(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAsset(value);
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
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.ContractCallWithMintApproved.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEventId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCommandId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDestinationChain();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getPayloadHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getAsset();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string chain = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string event_id = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getEventId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setEventId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes command_id = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getCommandId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes command_id = 3;
 * This is a type-conversion wrapper around `getCommandId()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getCommandId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCommandId()));
};


/**
 * optional bytes command_id = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCommandId()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getCommandId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCommandId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setCommandId = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string sender = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string destination_chain = 5;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getDestinationChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setDestinationChain = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string contract_address = 6;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional bytes payload_hash = 7;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getPayloadHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes payload_hash = 7;
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getPayloadHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPayloadHash()));
};


/**
 * optional bytes payload_hash = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getPayloadHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPayloadHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setPayloadHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional cosmos.base.v1beta1.Coin asset = 8;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.getAsset = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
*/
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.setAsset = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.ContractCallWithMintApproved} returns this
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.clearAsset = function() {
  return this.setAsset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.ContractCallWithMintApproved.prototype.hasAsset = function() {
  return jspb.Message.getField(this, 8) != null;
};


