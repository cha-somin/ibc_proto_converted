// source: irismod/coinswap/query.proto
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

goog.provide('proto.irismod.coinswap.QueryLiquidityPoolResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.irismod.coinswap.PoolInfo');

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
proto.irismod.coinswap.QueryLiquidityPoolResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.coinswap.QueryLiquidityPoolResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.coinswap.QueryLiquidityPoolResponse.displayName = 'proto.irismod.coinswap.QueryLiquidityPoolResponse';
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
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.coinswap.QueryLiquidityPoolResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    pool: (f = msg.getPool()) && proto.irismod.coinswap.PoolInfo.toObject(includeInstance, f)
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
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolResponse}
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.coinswap.QueryLiquidityPoolResponse;
  return proto.irismod.coinswap.QueryLiquidityPoolResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolResponse}
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.coinswap.PoolInfo;
      reader.readMessage(value,proto.irismod.coinswap.PoolInfo.deserializeBinaryFromReader);
      msg.setPool(value);
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
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.coinswap.QueryLiquidityPoolResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPool();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.irismod.coinswap.PoolInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional PoolInfo pool = 1;
 * @return {?proto.irismod.coinswap.PoolInfo}
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.getPool = function() {
  return /** @type{?proto.irismod.coinswap.PoolInfo} */ (
    jspb.Message.getWrapperField(this, proto.irismod.coinswap.PoolInfo, 1));
};


/**
 * @param {?proto.irismod.coinswap.PoolInfo|undefined} value
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolResponse} returns this
*/
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.setPool = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolResponse} returns this
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.clearPool = function() {
  return this.setPool(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.coinswap.QueryLiquidityPoolResponse.prototype.hasPool = function() {
  return jspb.Message.getField(this, 1) != null;
};


