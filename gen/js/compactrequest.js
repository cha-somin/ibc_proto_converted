// source: irismod/service/service.proto
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

goog.provide('proto.irismod.service.CompactRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.irismod.service.CompactRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.service.CompactRequest.repeatedFields_, null);
};
goog.inherits(proto.irismod.service.CompactRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.service.CompactRequest.displayName = 'proto.irismod.service.CompactRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.service.CompactRequest.repeatedFields_ = [4];



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
proto.irismod.service.CompactRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.service.CompactRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.service.CompactRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.CompactRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestContextId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    requestContextBatchCounter: jspb.Message.getFieldWithDefault(msg, 2, 0),
    provider: jspb.Message.getFieldWithDefault(msg, 3, ""),
    serviceFeeList: jspb.Message.toObjectList(msg.getServiceFeeList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    requestHeight: jspb.Message.getFieldWithDefault(msg, 5, 0),
    expirationHeight: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.irismod.service.CompactRequest}
 */
proto.irismod.service.CompactRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.service.CompactRequest;
  return proto.irismod.service.CompactRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.service.CompactRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.service.CompactRequest}
 */
proto.irismod.service.CompactRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestContextId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRequestContextBatchCounter(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setProvider(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addServiceFee(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setRequestHeight(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpirationHeight(value);
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
proto.irismod.service.CompactRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.service.CompactRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.service.CompactRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.CompactRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestContextId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRequestContextBatchCounter();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getProvider();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getServiceFeeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getRequestHeight();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getExpirationHeight();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
};


/**
 * optional string request_context_id = 1;
 * @return {string}
 */
proto.irismod.service.CompactRequest.prototype.getRequestContextId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.setRequestContextId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 request_context_batch_counter = 2;
 * @return {number}
 */
proto.irismod.service.CompactRequest.prototype.getRequestContextBatchCounter = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.setRequestContextBatchCounter = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string provider = 3;
 * @return {string}
 */
proto.irismod.service.CompactRequest.prototype.getProvider = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.setProvider = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin service_fee = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.irismod.service.CompactRequest.prototype.getServiceFeeList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.irismod.service.CompactRequest} returns this
*/
proto.irismod.service.CompactRequest.prototype.setServiceFeeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.service.CompactRequest.prototype.addServiceFee = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.clearServiceFeeList = function() {
  return this.setServiceFeeList([]);
};


/**
 * optional int64 request_height = 5;
 * @return {number}
 */
proto.irismod.service.CompactRequest.prototype.getRequestHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.setRequestHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional int64 expiration_height = 6;
 * @return {number}
 */
proto.irismod.service.CompactRequest.prototype.getExpirationHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.CompactRequest} returns this
 */
proto.irismod.service.CompactRequest.prototype.setExpirationHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


