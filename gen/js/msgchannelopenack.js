// source: ibc/core/channel/v1/tx.proto
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

goog.provide('proto.ibc.core.channel.v1.MsgChannelOpenAck');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.client.v1.Height');

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
proto.ibc.core.channel.v1.MsgChannelOpenAck = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.channel.v1.MsgChannelOpenAck, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.channel.v1.MsgChannelOpenAck.displayName = 'proto.ibc.core.channel.v1.MsgChannelOpenAck';
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
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.channel.v1.MsgChannelOpenAck.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.channel.v1.MsgChannelOpenAck} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.toObject = function(includeInstance, msg) {
  var f, obj = {
    portId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    channelId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    counterpartyChannelId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    counterpartyVersion: jspb.Message.getFieldWithDefault(msg, 4, ""),
    proofTry: msg.getProofTry_asB64(),
    proofHeight: (f = msg.getProofHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    signer: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.channel.v1.MsgChannelOpenAck;
  return proto.ibc.core.channel.v1.MsgChannelOpenAck.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.channel.v1.MsgChannelOpenAck} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPortId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setChannelId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCounterpartyChannelId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCounterpartyVersion(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProofTry(value);
      break;
    case 6:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setProofHeight(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.channel.v1.MsgChannelOpenAck.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.channel.v1.MsgChannelOpenAck} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPortId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getChannelId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCounterpartyChannelId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCounterpartyVersion();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getProofTry_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getProofHeight();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string port_id = 1;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getPortId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setPortId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string channel_id = 2;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string counterparty_channel_id = 3;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getCounterpartyChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setCounterpartyChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string counterparty_version = 4;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getCounterpartyVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setCounterpartyVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bytes proof_try = 5;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getProofTry = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes proof_try = 5;
 * This is a type-conversion wrapper around `getProofTry()`
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getProofTry_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProofTry()));
};


/**
 * optional bytes proof_try = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProofTry()`
 * @return {!Uint8Array}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getProofTry_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProofTry()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setProofTry = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional ibc.core.client.v1.Height proof_height = 6;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getProofHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 6));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
*/
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setProofHeight = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.clearProofHeight = function() {
  return this.setProofHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.hasProofHeight = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string signer = 7;
 * @return {string}
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.channel.v1.MsgChannelOpenAck} returns this
 */
proto.ibc.core.channel.v1.MsgChannelOpenAck.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


