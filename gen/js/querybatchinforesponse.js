// source: regen/ecocredit/v1alpha2/query.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.ecocredit.v1alpha2.BatchInfo');

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
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.displayName = 'proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse';
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
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    info: (f = msg.getInfo()) && proto.regen.ecocredit.v1alpha2.BatchInfo.toObject(includeInstance, f)
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
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse}
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse;
  return proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse}
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.ecocredit.v1alpha2.BatchInfo;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.BatchInfo.deserializeBinaryFromReader);
      msg.setInfo(value);
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
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.regen.ecocredit.v1alpha2.BatchInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional BatchInfo info = 1;
 * @return {?proto.regen.ecocredit.v1alpha2.BatchInfo}
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.getInfo = function() {
  return /** @type{?proto.regen.ecocredit.v1alpha2.BatchInfo} */ (
    jspb.Message.getWrapperField(this, proto.regen.ecocredit.v1alpha2.BatchInfo, 1));
};


/**
 * @param {?proto.regen.ecocredit.v1alpha2.BatchInfo|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse} returns this
*/
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.setInfo = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse} returns this
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.clearInfo = function() {
  return this.setInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.prototype.hasInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


