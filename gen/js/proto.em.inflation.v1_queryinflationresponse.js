// source: em/inflation/v1/query.proto
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

goog.provide('proto.em.inflation.v1.QueryInflationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.em.inflation.v1.InflationState');

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
proto.em.inflation.v1.QueryInflationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.inflation.v1.QueryInflationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.inflation.v1.QueryInflationResponse.displayName = 'proto.em.inflation.v1.QueryInflationResponse';
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
proto.em.inflation.v1.QueryInflationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.em.inflation.v1.QueryInflationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.inflation.v1.QueryInflationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.inflation.v1.QueryInflationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    state: (f = msg.getState()) && proto.em.inflation.v1.InflationState.toObject(includeInstance, f)
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
 * @return {!proto.em.inflation.v1.QueryInflationResponse}
 */
proto.em.inflation.v1.QueryInflationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.inflation.v1.QueryInflationResponse;
  return proto.em.inflation.v1.QueryInflationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.inflation.v1.QueryInflationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.inflation.v1.QueryInflationResponse}
 */
proto.em.inflation.v1.QueryInflationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.em.inflation.v1.InflationState;
      reader.readMessage(value,proto.em.inflation.v1.InflationState.deserializeBinaryFromReader);
      msg.setState(value);
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
proto.em.inflation.v1.QueryInflationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.inflation.v1.QueryInflationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.inflation.v1.QueryInflationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.inflation.v1.QueryInflationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getState();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.em.inflation.v1.InflationState.serializeBinaryToWriter
    );
  }
};


/**
 * optional InflationState state = 1;
 * @return {?proto.em.inflation.v1.InflationState}
 */
proto.em.inflation.v1.QueryInflationResponse.prototype.getState = function() {
  return /** @type{?proto.em.inflation.v1.InflationState} */ (
    jspb.Message.getWrapperField(this, proto.em.inflation.v1.InflationState, 1));
};


/**
 * @param {?proto.em.inflation.v1.InflationState|undefined} value
 * @return {!proto.em.inflation.v1.QueryInflationResponse} returns this
*/
proto.em.inflation.v1.QueryInflationResponse.prototype.setState = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.inflation.v1.QueryInflationResponse} returns this
 */
proto.em.inflation.v1.QueryInflationResponse.prototype.clearState = function() {
  return this.setState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.inflation.v1.QueryInflationResponse.prototype.hasState = function() {
  return jspb.Message.getField(this, 1) != null;
};

