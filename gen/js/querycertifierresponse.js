// source: shentu/cert/v1alpha1/query.proto
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

goog.provide('proto.shentu.cert.v1alpha1.QueryCertifierResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.shentu.cert.v1alpha1.Certifier');

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
proto.shentu.cert.v1alpha1.QueryCertifierResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.shentu.cert.v1alpha1.QueryCertifierResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.cert.v1alpha1.QueryCertifierResponse.displayName = 'proto.shentu.cert.v1alpha1.QueryCertifierResponse';
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
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.cert.v1alpha1.QueryCertifierResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.cert.v1alpha1.QueryCertifierResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    certifier: (f = msg.getCertifier()) && proto.shentu.cert.v1alpha1.Certifier.toObject(includeInstance, f)
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
 * @return {!proto.shentu.cert.v1alpha1.QueryCertifierResponse}
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.cert.v1alpha1.QueryCertifierResponse;
  return proto.shentu.cert.v1alpha1.QueryCertifierResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.cert.v1alpha1.QueryCertifierResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.cert.v1alpha1.QueryCertifierResponse}
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.shentu.cert.v1alpha1.Certifier;
      reader.readMessage(value,proto.shentu.cert.v1alpha1.Certifier.deserializeBinaryFromReader);
      msg.setCertifier(value);
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
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.cert.v1alpha1.QueryCertifierResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.cert.v1alpha1.QueryCertifierResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCertifier();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.shentu.cert.v1alpha1.Certifier.serializeBinaryToWriter
    );
  }
};


/**
 * optional Certifier certifier = 1;
 * @return {?proto.shentu.cert.v1alpha1.Certifier}
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.getCertifier = function() {
  return /** @type{?proto.shentu.cert.v1alpha1.Certifier} */ (
    jspb.Message.getWrapperField(this, proto.shentu.cert.v1alpha1.Certifier, 1));
};


/**
 * @param {?proto.shentu.cert.v1alpha1.Certifier|undefined} value
 * @return {!proto.shentu.cert.v1alpha1.QueryCertifierResponse} returns this
*/
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.setCertifier = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.cert.v1alpha1.QueryCertifierResponse} returns this
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.clearCertifier = function() {
  return this.setCertifier(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.cert.v1alpha1.QueryCertifierResponse.prototype.hasCertifier = function() {
  return jspb.Message.getField(this, 1) != null;
};


