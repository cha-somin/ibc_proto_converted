// source: comdex/lend/v1beta1/lend.proto
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

goog.provide('proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping');

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
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.repeatedFields_, null);
};
goog.inherits(proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.displayName = 'proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.repeatedFields_ = [4];



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
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    lendId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    poolId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    borrowIdList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f
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
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping;
  return proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLendId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 4:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addBorrowId(values[i]);
      }
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
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getLendId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getBorrowIdList();
  if (f.length > 0) {
    writer.writePackedUint64(
      4,
      f
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 lend_id = 2;
 * @return {number}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.getLendId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.setLendId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 pool_id = 3;
 * @return {number}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated uint64 borrow_id = 4;
 * @return {!Array<number>}
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.getBorrowIdList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.setBorrowIdList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.addBorrowId = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping} returns this
 */
proto.comdex.lend.v1beta1.UserAssetLendBorrowMapping.prototype.clearBorrowIdList = function() {
  return this.setBorrowIdList([]);
};


