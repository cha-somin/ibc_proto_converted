// source: comdex/locker/v1beta1/locker.proto
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

goog.provide('proto.comdex.locker.v1beta1.LockerLookupTableData');

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
proto.comdex.locker.v1beta1.LockerLookupTableData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.locker.v1beta1.LockerLookupTableData.repeatedFields_, null);
};
goog.inherits(proto.comdex.locker.v1beta1.LockerLookupTableData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.locker.v1beta1.LockerLookupTableData.displayName = 'proto.comdex.locker.v1beta1.LockerLookupTableData';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.repeatedFields_ = [3];



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
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.locker.v1beta1.LockerLookupTableData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.locker.v1beta1.LockerLookupTableData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.toObject = function(includeInstance, msg) {
  var f, obj = {
    appId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    assetId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    lockerIdsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    depositedAmount: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.locker.v1beta1.LockerLookupTableData;
  return proto.comdex.locker.v1beta1.LockerLookupTableData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.locker.v1beta1.LockerLookupTableData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetId(value);
      break;
    case 3:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addLockerIds(values[i]);
      }
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositedAmount(value);
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
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.locker.v1beta1.LockerLookupTableData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.locker.v1beta1.LockerLookupTableData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAssetId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getLockerIdsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      3,
      f
    );
  }
  f = message.getDepositedAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 app_id = 1;
 * @return {number}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 asset_id = 2;
 * @return {number}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.getAssetId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.setAssetId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated uint64 locker_ids = 3;
 * @return {!Array<number>}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.getLockerIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.setLockerIdsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.addLockerIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.clearLockerIdsList = function() {
  return this.setLockerIdsList([]);
};


/**
 * optional string deposited_amount = 4;
 * @return {string}
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.getDepositedAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData} returns this
 */
proto.comdex.locker.v1beta1.LockerLookupTableData.prototype.setDepositedAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


