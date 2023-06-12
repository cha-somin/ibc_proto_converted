// source: teritori/airdrop/v1beta1/tx.proto
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

goog.provide('proto.teritori.airdrop.v1beta1.MsgClaimAllocation');

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
proto.teritori.airdrop.v1beta1.MsgClaimAllocation = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.teritori.airdrop.v1beta1.MsgClaimAllocation, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.teritori.airdrop.v1beta1.MsgClaimAllocation.displayName = 'proto.teritori.airdrop.v1beta1.MsgClaimAllocation';
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
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.toObject = function(opt_includeInstance) {
  return proto.teritori.airdrop.v1beta1.MsgClaimAllocation.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pubKey: jspb.Message.getFieldWithDefault(msg, 2, ""),
    rewardAddress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    signature: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.teritori.airdrop.v1beta1.MsgClaimAllocation;
  return proto.teritori.airdrop.v1beta1.MsgClaimAllocation.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPubKey(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewardAddress(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSignature(value);
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
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.teritori.airdrop.v1beta1.MsgClaimAllocation.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPubKey();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRewardAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSignature();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string address = 1;
 * @return {string}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} returns this
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string pub_key = 2;
 * @return {string}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.getPubKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} returns this
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.setPubKey = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string reward_address = 3;
 * @return {string}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.getRewardAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} returns this
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.setRewardAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string signature = 4;
 * @return {string}
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.getSignature = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.teritori.airdrop.v1beta1.MsgClaimAllocation} returns this
 */
proto.teritori.airdrop.v1beta1.MsgClaimAllocation.prototype.setSignature = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


