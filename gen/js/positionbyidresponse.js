// source: osmosis/concentrated-liquidity/query.proto
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

goog.provide('proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown');

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
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.displayName = 'proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse';
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
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    position: (f = msg.getPosition()) && proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse;
  return proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown;
      reader.readMessage(value,proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown.deserializeBinaryFromReader);
      msg.setPosition(value);
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
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPosition();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown.serializeBinaryToWriter
    );
  }
};


/**
 * optional FullPositionBreakdown position = 1;
 * @return {?proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown}
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.getPosition = function() {
  return /** @type{?proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown, 1));
};


/**
 * @param {?proto.osmosis.concentratedliquidity.v1beta1.FullPositionBreakdown|undefined} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse} returns this
*/
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.setPosition = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.clearPosition = function() {
  return this.setPosition(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.prototype.hasPosition = function() {
  return jspb.Message.getField(this, 1) != null;
};

