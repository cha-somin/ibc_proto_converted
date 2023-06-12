// source: injective/peggy/v1/msgs.proto
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

goog.provide('proto.injective.peggy.v1.MsgWithdrawClaim');

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
proto.injective.peggy.v1.MsgWithdrawClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.peggy.v1.MsgWithdrawClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.MsgWithdrawClaim.displayName = 'proto.injective.peggy.v1.MsgWithdrawClaim';
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
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.MsgWithdrawClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.MsgWithdrawClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.MsgWithdrawClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventNonce: jspb.Message.getFieldWithDefault(msg, 1, 0),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 2, 0),
    batchNonce: jspb.Message.getFieldWithDefault(msg, 3, 0),
    tokenContract: jspb.Message.getFieldWithDefault(msg, 4, ""),
    orchestrator: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.MsgWithdrawClaim;
  return proto.injective.peggy.v1.MsgWithdrawClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.MsgWithdrawClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEventNonce(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockHeight(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchNonce(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenContract(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrchestrator(value);
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
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.MsgWithdrawClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.MsgWithdrawClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.MsgWithdrawClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventNonce();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getBatchNonce();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getTokenContract();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOrchestrator();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 event_nonce = 1;
 * @return {number}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.getEventNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim} returns this
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.setEventNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 block_height = 2;
 * @return {number}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim} returns this
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 batch_nonce = 3;
 * @return {number}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.getBatchNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim} returns this
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.setBatchNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string token_contract = 4;
 * @return {string}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.getTokenContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim} returns this
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.setTokenContract = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string orchestrator = 5;
 * @return {string}
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.getOrchestrator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.MsgWithdrawClaim} returns this
 */
proto.injective.peggy.v1.MsgWithdrawClaim.prototype.setOrchestrator = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


