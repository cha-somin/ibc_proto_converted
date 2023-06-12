// source: gravity/v1/query.proto
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

goog.provide('proto.gravity.v1.QueryBatchConfirmsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gravity.v1.MsgConfirmBatch');

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
proto.gravity.v1.QueryBatchConfirmsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gravity.v1.QueryBatchConfirmsResponse.repeatedFields_, null);
};
goog.inherits(proto.gravity.v1.QueryBatchConfirmsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gravity.v1.QueryBatchConfirmsResponse.displayName = 'proto.gravity.v1.QueryBatchConfirmsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gravity.v1.QueryBatchConfirmsResponse.repeatedFields_ = [1];



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
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.gravity.v1.QueryBatchConfirmsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gravity.v1.QueryBatchConfirmsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryBatchConfirmsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    confirmsList: jspb.Message.toObjectList(msg.getConfirmsList(),
    proto.gravity.v1.MsgConfirmBatch.toObject, includeInstance)
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
 * @return {!proto.gravity.v1.QueryBatchConfirmsResponse}
 */
proto.gravity.v1.QueryBatchConfirmsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gravity.v1.QueryBatchConfirmsResponse;
  return proto.gravity.v1.QueryBatchConfirmsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gravity.v1.QueryBatchConfirmsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gravity.v1.QueryBatchConfirmsResponse}
 */
proto.gravity.v1.QueryBatchConfirmsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gravity.v1.MsgConfirmBatch;
      reader.readMessage(value,proto.gravity.v1.MsgConfirmBatch.deserializeBinaryFromReader);
      msg.addConfirms(value);
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
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gravity.v1.QueryBatchConfirmsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gravity.v1.QueryBatchConfirmsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryBatchConfirmsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConfirmsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.gravity.v1.MsgConfirmBatch.serializeBinaryToWriter
    );
  }
};


/**
 * repeated MsgConfirmBatch confirms = 1;
 * @return {!Array<!proto.gravity.v1.MsgConfirmBatch>}
 */
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.getConfirmsList = function() {
  return /** @type{!Array<!proto.gravity.v1.MsgConfirmBatch>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.MsgConfirmBatch, 1));
};


/**
 * @param {!Array<!proto.gravity.v1.MsgConfirmBatch>} value
 * @return {!proto.gravity.v1.QueryBatchConfirmsResponse} returns this
*/
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.setConfirmsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.gravity.v1.MsgConfirmBatch=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.MsgConfirmBatch}
 */
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.addConfirms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.gravity.v1.MsgConfirmBatch, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.QueryBatchConfirmsResponse} returns this
 */
proto.gravity.v1.QueryBatchConfirmsResponse.prototype.clearConfirmsList = function() {
  return this.setConfirmsList([]);
};


