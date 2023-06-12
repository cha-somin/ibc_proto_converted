// source: axelar/nexus/v1beta1/query.proto
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

goog.provide('proto.axelar.nexus.v1beta1.TransfersForChainResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.exported.v1beta1.CrossChainTransfer');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.axelar.nexus.v1beta1.TransfersForChainResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.nexus.v1beta1.TransfersForChainResponse.repeatedFields_, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.TransfersForChainResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.TransfersForChainResponse.displayName = 'proto.axelar.nexus.v1beta1.TransfersForChainResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.repeatedFields_ = [1];



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
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.TransfersForChainResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    transfersList: jspb.Message.toObjectList(msg.getTransfersList(),
    proto.axelar.nexus.exported.v1beta1.CrossChainTransfer.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.TransfersForChainResponse;
  return proto.axelar.nexus.v1beta1.TransfersForChainResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.nexus.exported.v1beta1.CrossChainTransfer;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.CrossChainTransfer.deserializeBinaryFromReader);
      msg.addTransfers(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.TransfersForChainResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTransfersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.axelar.nexus.exported.v1beta1.CrossChainTransfer.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1;
 * @return {!Array<!proto.axelar.nexus.exported.v1beta1.CrossChainTransfer>}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.getTransfersList = function() {
  return /** @type{!Array<!proto.axelar.nexus.exported.v1beta1.CrossChainTransfer>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.nexus.exported.v1beta1.CrossChainTransfer, 1));
};


/**
 * @param {!Array<!proto.axelar.nexus.exported.v1beta1.CrossChainTransfer>} value
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} returns this
*/
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.setTransfersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.axelar.nexus.exported.v1beta1.CrossChainTransfer=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.nexus.exported.v1beta1.CrossChainTransfer}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.addTransfers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.axelar.nexus.exported.v1beta1.CrossChainTransfer, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} returns this
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.clearTransfersList = function() {
  return this.setTransfersList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} returns this
*/
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.TransfersForChainResponse} returns this
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.TransfersForChainResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


