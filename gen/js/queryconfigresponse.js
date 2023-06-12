// source: iov/configuration/v1beta1/query.proto
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

goog.provide('proto.starnamed.x.configuration.v1beta1.QueryConfigResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.starnamed.x.configuration.v1beta1.Config');

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
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.configuration.v1beta1.QueryConfigResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.displayName = 'proto.starnamed.x.configuration.v1beta1.QueryConfigResponse';
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
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    config: (f = msg.getConfig()) && proto.starnamed.x.configuration.v1beta1.Config.toObject(includeInstance, f)
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
 * @return {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse}
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.configuration.v1beta1.QueryConfigResponse;
  return proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse}
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.starnamed.x.configuration.v1beta1.Config;
      reader.readMessage(value,proto.starnamed.x.configuration.v1beta1.Config.deserializeBinaryFromReader);
      msg.setConfig(value);
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
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConfig();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.starnamed.x.configuration.v1beta1.Config.serializeBinaryToWriter
    );
  }
};


/**
 * optional Config config = 1;
 * @return {?proto.starnamed.x.configuration.v1beta1.Config}
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.getConfig = function() {
  return /** @type{?proto.starnamed.x.configuration.v1beta1.Config} */ (
    jspb.Message.getWrapperField(this, proto.starnamed.x.configuration.v1beta1.Config, 1));
};


/**
 * @param {?proto.starnamed.x.configuration.v1beta1.Config|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse} returns this
*/
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.setConfig = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.QueryConfigResponse} returns this
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.clearConfig = function() {
  return this.setConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.QueryConfigResponse.prototype.hasConfig = function() {
  return jspb.Message.getField(this, 1) != null;
};


