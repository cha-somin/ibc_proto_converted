// source: cosmos/feegrant/v1beta1/query.proto
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

goog.provide('proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.feegrant.v1beta1.Grant');

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
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.displayName = 'proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse';
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
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    allowance: (f = msg.getAllowance()) && proto.cosmos.feegrant.v1beta1.Grant.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse}
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse;
  return proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse}
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.feegrant.v1beta1.Grant;
      reader.readMessage(value,proto.cosmos.feegrant.v1beta1.Grant.deserializeBinaryFromReader);
      msg.setAllowance(value);
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
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAllowance();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.feegrant.v1beta1.Grant.serializeBinaryToWriter
    );
  }
};


/**
 * optional Grant allowance = 1;
 * @return {?proto.cosmos.feegrant.v1beta1.Grant}
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.getAllowance = function() {
  return /** @type{?proto.cosmos.feegrant.v1beta1.Grant} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.feegrant.v1beta1.Grant, 1));
};


/**
 * @param {?proto.cosmos.feegrant.v1beta1.Grant|undefined} value
 * @return {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse} returns this
*/
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.setAllowance = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse} returns this
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.clearAllowance = function() {
  return this.setAllowance(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.feegrant.v1beta1.QueryAllowanceResponse.prototype.hasAllowance = function() {
  return jspb.Message.getField(this, 1) != null;
};


