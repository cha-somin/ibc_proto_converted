// source: likechain/likenft/v1/query.proto
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

goog.provide('proto.likechain.likenft.v1.QueryBlindBoxContentResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.BlindBoxContent');

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
proto.likechain.likenft.v1.QueryBlindBoxContentResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.QueryBlindBoxContentResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.QueryBlindBoxContentResponse.displayName = 'proto.likechain.likenft.v1.QueryBlindBoxContentResponse';
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
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.QueryBlindBoxContentResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    blindBoxContent: (f = msg.getBlindBoxContent()) && proto.likechain.likenft.v1.BlindBoxContent.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.QueryBlindBoxContentResponse;
  return proto.likechain.likenft.v1.QueryBlindBoxContentResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.likechain.likenft.v1.BlindBoxContent;
      reader.readMessage(value,proto.likechain.likenft.v1.BlindBoxContent.deserializeBinaryFromReader);
      msg.setBlindBoxContent(value);
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
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.QueryBlindBoxContentResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlindBoxContent();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.likechain.likenft.v1.BlindBoxContent.serializeBinaryToWriter
    );
  }
};


/**
 * optional BlindBoxContent blind_box_content = 1;
 * @return {?proto.likechain.likenft.v1.BlindBoxContent}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.getBlindBoxContent = function() {
  return /** @type{?proto.likechain.likenft.v1.BlindBoxContent} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.BlindBoxContent, 1));
};


/**
 * @param {?proto.likechain.likenft.v1.BlindBoxContent|undefined} value
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse} returns this
*/
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.setBlindBoxContent = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentResponse} returns this
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.clearBlindBoxContent = function() {
  return this.setBlindBoxContent(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentResponse.prototype.hasBlindBoxContent = function() {
  return jspb.Message.getField(this, 1) != null;
};


