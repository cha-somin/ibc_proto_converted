// source: comdex/lend/v1beta1/query.proto
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

goog.provide('proto.comdex.lend.v1beta1.QueryBorrowResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.lend.v1beta1.BorrowAsset');

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
proto.comdex.lend.v1beta1.QueryBorrowResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.lend.v1beta1.QueryBorrowResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.QueryBorrowResponse.displayName = 'proto.comdex.lend.v1beta1.QueryBorrowResponse';
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
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.QueryBorrowResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.QueryBorrowResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    borrow: (f = msg.getBorrow()) && proto.comdex.lend.v1beta1.BorrowAsset.toObject(includeInstance, f)
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
 * @return {!proto.comdex.lend.v1beta1.QueryBorrowResponse}
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.QueryBorrowResponse;
  return proto.comdex.lend.v1beta1.QueryBorrowResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.QueryBorrowResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.QueryBorrowResponse}
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.lend.v1beta1.BorrowAsset;
      reader.readMessage(value,proto.comdex.lend.v1beta1.BorrowAsset.deserializeBinaryFromReader);
      msg.setBorrow(value);
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
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.QueryBorrowResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.QueryBorrowResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBorrow();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.comdex.lend.v1beta1.BorrowAsset.serializeBinaryToWriter
    );
  }
};


/**
 * optional BorrowAsset borrow = 1;
 * @return {?proto.comdex.lend.v1beta1.BorrowAsset}
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.getBorrow = function() {
  return /** @type{?proto.comdex.lend.v1beta1.BorrowAsset} */ (
    jspb.Message.getWrapperField(this, proto.comdex.lend.v1beta1.BorrowAsset, 1));
};


/**
 * @param {?proto.comdex.lend.v1beta1.BorrowAsset|undefined} value
 * @return {!proto.comdex.lend.v1beta1.QueryBorrowResponse} returns this
*/
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.setBorrow = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.QueryBorrowResponse} returns this
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.clearBorrow = function() {
  return this.setBorrow(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.QueryBorrowResponse.prototype.hasBorrow = function() {
  return jspb.Message.getField(this, 1) != null;
};


