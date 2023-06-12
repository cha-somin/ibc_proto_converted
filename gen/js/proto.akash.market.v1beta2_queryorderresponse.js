// source: akash/market/v1beta2/query.proto
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

goog.provide('proto.akash.market.v1beta2.QueryOrderResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.market.v1beta2.Order');

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
proto.akash.market.v1beta2.QueryOrderResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.market.v1beta2.QueryOrderResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.market.v1beta2.QueryOrderResponse.displayName = 'proto.akash.market.v1beta2.QueryOrderResponse';
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
proto.akash.market.v1beta2.QueryOrderResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.market.v1beta2.QueryOrderResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.market.v1beta2.QueryOrderResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.market.v1beta2.QueryOrderResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    order: (f = msg.getOrder()) && proto.akash.market.v1beta2.Order.toObject(includeInstance, f)
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
 * @return {!proto.akash.market.v1beta2.QueryOrderResponse}
 */
proto.akash.market.v1beta2.QueryOrderResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.market.v1beta2.QueryOrderResponse;
  return proto.akash.market.v1beta2.QueryOrderResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.market.v1beta2.QueryOrderResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.market.v1beta2.QueryOrderResponse}
 */
proto.akash.market.v1beta2.QueryOrderResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.market.v1beta2.Order;
      reader.readMessage(value,proto.akash.market.v1beta2.Order.deserializeBinaryFromReader);
      msg.setOrder(value);
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
proto.akash.market.v1beta2.QueryOrderResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.market.v1beta2.QueryOrderResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.market.v1beta2.QueryOrderResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.market.v1beta2.QueryOrderResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrder();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.market.v1beta2.Order.serializeBinaryToWriter
    );
  }
};


/**
 * optional Order order = 1;
 * @return {?proto.akash.market.v1beta2.Order}
 */
proto.akash.market.v1beta2.QueryOrderResponse.prototype.getOrder = function() {
  return /** @type{?proto.akash.market.v1beta2.Order} */ (
    jspb.Message.getWrapperField(this, proto.akash.market.v1beta2.Order, 1));
};


/**
 * @param {?proto.akash.market.v1beta2.Order|undefined} value
 * @return {!proto.akash.market.v1beta2.QueryOrderResponse} returns this
*/
proto.akash.market.v1beta2.QueryOrderResponse.prototype.setOrder = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.market.v1beta2.QueryOrderResponse} returns this
 */
proto.akash.market.v1beta2.QueryOrderResponse.prototype.clearOrder = function() {
  return this.setOrder(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.market.v1beta2.QueryOrderResponse.prototype.hasOrder = function() {
  return jspb.Message.getField(this, 1) != null;
};


