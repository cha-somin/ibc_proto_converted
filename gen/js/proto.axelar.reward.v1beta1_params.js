// source: axelar/reward/v1beta1/params.proto
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

goog.provide('proto.axelar.reward.v1beta1.Params');

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
proto.axelar.reward.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.reward.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.reward.v1beta1.Params.displayName = 'proto.axelar.reward.v1beta1.Params';
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
proto.axelar.reward.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.reward.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.reward.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.reward.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    externalChainVotingInflationRate: msg.getExternalChainVotingInflationRate_asB64(),
    keyMgmtRelativeInflationRate: msg.getKeyMgmtRelativeInflationRate_asB64()
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
 * @return {!proto.axelar.reward.v1beta1.Params}
 */
proto.axelar.reward.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.reward.v1beta1.Params;
  return proto.axelar.reward.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.reward.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.reward.v1beta1.Params}
 */
proto.axelar.reward.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setExternalChainVotingInflationRate(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKeyMgmtRelativeInflationRate(value);
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
proto.axelar.reward.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.reward.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.reward.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.reward.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getExternalChainVotingInflationRate_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getKeyMgmtRelativeInflationRate_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional bytes external_chain_voting_inflation_rate = 1;
 * @return {string}
 */
proto.axelar.reward.v1beta1.Params.prototype.getExternalChainVotingInflationRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes external_chain_voting_inflation_rate = 1;
 * This is a type-conversion wrapper around `getExternalChainVotingInflationRate()`
 * @return {string}
 */
proto.axelar.reward.v1beta1.Params.prototype.getExternalChainVotingInflationRate_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getExternalChainVotingInflationRate()));
};


/**
 * optional bytes external_chain_voting_inflation_rate = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getExternalChainVotingInflationRate()`
 * @return {!Uint8Array}
 */
proto.axelar.reward.v1beta1.Params.prototype.getExternalChainVotingInflationRate_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getExternalChainVotingInflationRate()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.reward.v1beta1.Params} returns this
 */
proto.axelar.reward.v1beta1.Params.prototype.setExternalChainVotingInflationRate = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes key_mgmt_relative_inflation_rate = 2;
 * @return {string}
 */
proto.axelar.reward.v1beta1.Params.prototype.getKeyMgmtRelativeInflationRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes key_mgmt_relative_inflation_rate = 2;
 * This is a type-conversion wrapper around `getKeyMgmtRelativeInflationRate()`
 * @return {string}
 */
proto.axelar.reward.v1beta1.Params.prototype.getKeyMgmtRelativeInflationRate_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKeyMgmtRelativeInflationRate()));
};


/**
 * optional bytes key_mgmt_relative_inflation_rate = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKeyMgmtRelativeInflationRate()`
 * @return {!Uint8Array}
 */
proto.axelar.reward.v1beta1.Params.prototype.getKeyMgmtRelativeInflationRate_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKeyMgmtRelativeInflationRate()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.reward.v1beta1.Params} returns this
 */
proto.axelar.reward.v1beta1.Params.prototype.setKeyMgmtRelativeInflationRate = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


