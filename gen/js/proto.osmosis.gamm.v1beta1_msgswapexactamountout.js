// source: osmosis/gamm/v1beta1/tx.proto
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

goog.provide('proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute');

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
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.repeatedFields_, null);
};
goog.inherits(proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.displayName = 'proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.repeatedFields_ = [2];



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
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    routesList: jspb.Message.toObjectList(msg.getRoutesList(),
    proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute.toObject, includeInstance),
    tokenInMaxAmount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    tokenOut: (f = msg.getTokenOut()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut;
  return proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute;
      reader.readMessage(value,proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute.deserializeBinaryFromReader);
      msg.addRoutes(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenInMaxAmount(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
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
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRoutesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute.serializeBinaryToWriter
    );
  }
  f = message.getTokenInMaxAmount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTokenOut();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated osmosis.poolmanager.v1beta1.SwapAmountOutRoute routes = 2;
 * @return {!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute>}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.getRoutesList = function() {
  return /** @type{!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute, 2));
};


/**
 * @param {!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute>} value
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
*/
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.setRoutesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.addRoutes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.osmosis.poolmanager.v1beta1.SwapAmountOutRoute, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.clearRoutesList = function() {
  return this.setRoutesList([]);
};


/**
 * optional string token_in_max_amount = 3;
 * @return {string}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.getTokenInMaxAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.setTokenInMaxAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin token_out = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.getTokenOut = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
*/
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.setTokenOut = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut} returns this
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.clearTokenOut = function() {
  return this.setTokenOut(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.prototype.hasTokenOut = function() {
  return jspb.Message.getField(this, 4) != null;
};


