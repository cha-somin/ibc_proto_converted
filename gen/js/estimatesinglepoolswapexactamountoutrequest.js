// source: osmosis/poolmanager/v1beta1/query.proto
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

goog.provide('proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest');

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
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.displayName = 'proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest';
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
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    tokenInDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    tokenOut: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest}
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest;
  return proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest}
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenInDenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenOut(value);
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
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getTokenInDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTokenOut();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} returns this
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string token_in_denom = 2;
 * @return {string}
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.getTokenInDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} returns this
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.setTokenInDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string token_out = 3;
 * @return {string}
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.getTokenOut = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest} returns this
 */
proto.osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest.prototype.setTokenOut = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

