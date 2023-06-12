// source: osmosis/poolmanager/v1beta1/tx.proto
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

goog.provide('proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute');

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
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.repeatedFields_, null);
};
goog.inherits(proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.displayName = 'proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.repeatedFields_ = [2];



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
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    routesList: jspb.Message.toObjectList(msg.getRoutesList(),
    proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute.toObject, includeInstance),
    tokenOutDenom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    tokenInMaxAmount: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut;
  return proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute;
      reader.readMessage(value,proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute.deserializeBinaryFromReader);
      msg.addRoutes(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenOutDenom(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenInMaxAmount(value);
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
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.serializeBinaryToWriter = function(message, writer) {
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
      proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute.serializeBinaryToWriter
    );
  }
  f = message.getTokenOutDenom();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTokenInMaxAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} returns this
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated SwapAmountOutSplitRoute routes = 2;
 * @return {!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute>}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.getRoutesList = function() {
  return /** @type{!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute, 2));
};


/**
 * @param {!Array<!proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute>} value
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} returns this
*/
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.setRoutesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.addRoutes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRoute, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} returns this
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.clearRoutesList = function() {
  return this.setRoutesList([]);
};


/**
 * optional string token_out_denom = 3;
 * @return {string}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.getTokenOutDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} returns this
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.setTokenOutDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string token_in_max_amount = 4;
 * @return {string}
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.getTokenInMaxAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut} returns this
 */
proto.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut.prototype.setTokenInMaxAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


