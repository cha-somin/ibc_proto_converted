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

goog.provide('proto.irismod.coinswap.QueryLiquidityPoolsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
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
proto.irismod.coinswap.QueryLiquidityPoolsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.coinswap.QueryLiquidityPoolsResponse.repeatedFields_, null);
};
goog.inherits(proto.irismod.coinswap.QueryLiquidityPoolsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.coinswap.QueryLiquidityPoolsResponse.displayName = 'proto.irismod.coinswap.QueryLiquidityPoolsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.repeatedFields_ = [1];



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
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.coinswap.QueryLiquidityPoolsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolsList: jspb.Message.toObjectList(msg.getPoolsList(),
    proto.irismod.coinswap.PoolInfo.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.coinswap.QueryLiquidityPoolsResponse;
  return proto.irismod.coinswap.QueryLiquidityPoolsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.coinswap.PoolInfo;
      reader.readMessage(value,proto.irismod.coinswap.PoolInfo.deserializeBinaryFromReader);
      msg.addPools(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.coinswap.QueryLiquidityPoolsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.irismod.coinswap.PoolInfo.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated PoolInfo pools = 1;
 * @return {!Array<!proto.irismod.coinswap.PoolInfo>}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.getPoolsList = function() {
  return /** @type{!Array<!proto.irismod.coinswap.PoolInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.coinswap.PoolInfo, 1));
};


/**
 * @param {!Array<!proto.irismod.coinswap.PoolInfo>} value
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} returns this
*/
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.setPoolsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.irismod.coinswap.PoolInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.coinswap.PoolInfo}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.addPools = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.irismod.coinswap.PoolInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} returns this
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.clearPoolsList = function() {
  return this.setPoolsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} returns this
*/
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.coinswap.QueryLiquidityPoolsResponse} returns this
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.coinswap.QueryLiquidityPoolsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


