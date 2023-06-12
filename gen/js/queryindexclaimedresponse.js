// source: bitsong/merkledrop/v1beta1/query.proto
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

goog.provide('proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.displayName = 'proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse';
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
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    isClaimed: jspb.Message.getBooleanFieldWithDefault(msg, 1, false)
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
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse}
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse;
  return proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse}
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsClaimed(value);
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
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIsClaimed();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
};


/**
 * optional bool is_claimed = 1;
 * @return {boolean}
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.prototype.getIsClaimed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse} returns this
 */
proto.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.prototype.setIsClaimed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


