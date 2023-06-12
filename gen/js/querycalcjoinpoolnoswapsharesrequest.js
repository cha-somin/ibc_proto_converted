// source: osmosis/gamm/v1beta1/query.proto
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

goog.provide('proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest');

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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.repeatedFields_, null);
};
goog.inherits(proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.displayName = 'proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.repeatedFields_ = [2];



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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    tokensInList: jspb.Message.toObjectList(msg.getTokensInList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest;
  return proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addTokensIn(value);
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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getTokensInList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} returns this
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin tokens_in = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.getTokensInList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} returns this
*/
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.setTokensInList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.addTokensIn = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest} returns this
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.prototype.clearTokensInList = function() {
  return this.setTokensInList([]);
};


