// source: cosmos/distribution/v1beta1/query.proto
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

goog.provide('proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse');

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
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.displayName = 'proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse';
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
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    withdrawAddress: jspb.Message.getFieldWithDefault(msg, 1, "")
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
 * @return {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse}
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse;
  return proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse}
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setWithdrawAddress(value);
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
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getWithdrawAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string withdraw_address = 1;
 * @return {string}
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.prototype.getWithdrawAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse} returns this
 */
proto.cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressResponse.prototype.setWithdrawAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


