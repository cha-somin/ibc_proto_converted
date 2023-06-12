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

goog.provide('proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse');

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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.displayName = 'proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.repeatedFields_ = [1];



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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    tokensOutList: jspb.Message.toObjectList(msg.getTokensOutList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    sharesOut: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse;
  return proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addTokensOut(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSharesOut(value);
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
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTokensOutList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSharesOut();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin tokens_out = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.getTokensOutList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} returns this
*/
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.setTokensOutList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.addTokensOut = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} returns this
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.clearTokensOutList = function() {
  return this.setTokensOutList([]);
};


/**
 * optional string shares_out = 2;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.getSharesOut = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse} returns this
 */
proto.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.prototype.setSharesOut = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


