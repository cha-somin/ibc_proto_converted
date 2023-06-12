// source: quicksilver/interchainquery/v1/messages.proto
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

goog.provide('proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.crypto.ProofOps');

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
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.displayName = 'proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse';
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
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    queryId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    result: msg.getResult_asB64(),
    proofOps: (f = msg.getProofOps()) && proto.tendermint.crypto.ProofOps.toObject(includeInstance, f),
    height: jspb.Message.getFieldWithDefault(msg, 5, 0),
    fromAddress: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse;
  return proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setQueryId(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setResult(value);
      break;
    case 4:
      var value = new proto.tendermint.crypto.ProofOps;
      reader.readMessage(value,proto.tendermint.crypto.ProofOps.deserializeBinaryFromReader);
      msg.setProofOps(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromAddress(value);
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
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getQueryId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getResult_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getProofOps();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.crypto.ProofOps.serializeBinaryToWriter
    );
  }
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getFromAddress();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string query_id = 2;
 * @return {string}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getQueryId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setQueryId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes result = 3;
 * @return {string}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getResult = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes result = 3;
 * This is a type-conversion wrapper around `getResult()`
 * @return {string}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getResult_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getResult()));
};


/**
 * optional bytes result = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getResult()`
 * @return {!Uint8Array}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getResult_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getResult()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setResult = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional tendermint.crypto.ProofOps proof_ops = 4;
 * @return {?proto.tendermint.crypto.ProofOps}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getProofOps = function() {
  return /** @type{?proto.tendermint.crypto.ProofOps} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.crypto.ProofOps, 4));
};


/**
 * @param {?proto.tendermint.crypto.ProofOps|undefined} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
*/
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setProofOps = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.clearProofOps = function() {
  return this.setProofOps(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.hasProofOps = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional int64 height = 5;
 * @return {number}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional string from_address = 6;
 * @return {string}
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.getFromAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse} returns this
 */
proto.quicksilver.interchainquery.v1.MsgSubmitQueryResponse.prototype.setFromAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


