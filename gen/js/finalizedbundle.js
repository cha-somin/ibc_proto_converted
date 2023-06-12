// source: kyve/bundles/v1beta1/bundles.proto
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

goog.provide('proto.kyve.bundles.v1beta1.FinalizedBundle');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.bundles.v1beta1.FinalizedAt');

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
proto.kyve.bundles.v1beta1.FinalizedBundle = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.bundles.v1beta1.FinalizedBundle, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.bundles.v1beta1.FinalizedBundle.displayName = 'proto.kyve.bundles.v1beta1.FinalizedBundle';
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
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.bundles.v1beta1.FinalizedBundle.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.bundles.v1beta1.FinalizedBundle} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    id: jspb.Message.getFieldWithDefault(msg, 2, 0),
    storageId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    uploader: jspb.Message.getFieldWithDefault(msg, 4, ""),
    fromIndex: jspb.Message.getFieldWithDefault(msg, 5, 0),
    toIndex: jspb.Message.getFieldWithDefault(msg, 6, 0),
    toKey: jspb.Message.getFieldWithDefault(msg, 7, ""),
    bundleSummary: jspb.Message.getFieldWithDefault(msg, 8, ""),
    dataHash: jspb.Message.getFieldWithDefault(msg, 9, ""),
    finalizedAt: (f = msg.getFinalizedAt()) && proto.kyve.bundles.v1beta1.FinalizedAt.toObject(includeInstance, f),
    fromKey: jspb.Message.getFieldWithDefault(msg, 11, ""),
    storageProviderId: jspb.Message.getFieldWithDefault(msg, 12, 0),
    compressionId: jspb.Message.getFieldWithDefault(msg, 13, 0)
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
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.bundles.v1beta1.FinalizedBundle;
  return proto.kyve.bundles.v1beta1.FinalizedBundle.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.bundles.v1beta1.FinalizedBundle} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setStorageId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUploader(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFromIndex(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setToIndex(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setToKey(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setBundleSummary(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setDataHash(value);
      break;
    case 10:
      var value = new proto.kyve.bundles.v1beta1.FinalizedAt;
      reader.readMessage(value,proto.kyve.bundles.v1beta1.FinalizedAt.deserializeBinaryFromReader);
      msg.setFinalizedAt(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromKey(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setStorageProviderId(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCompressionId(value);
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
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.bundles.v1beta1.FinalizedBundle.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.bundles.v1beta1.FinalizedBundle} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getStorageId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUploader();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getFromIndex();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getToIndex();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getToKey();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getBundleSummary();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getDataHash();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getFinalizedAt();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.kyve.bundles.v1beta1.FinalizedAt.serializeBinaryToWriter
    );
  }
  f = message.getFromKey();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getStorageProviderId();
  if (f !== 0) {
    writer.writeUint32(
      12,
      f
    );
  }
  f = message.getCompressionId();
  if (f !== 0) {
    writer.writeUint32(
      13,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 id = 2;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string storage_id = 3;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getStorageId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setStorageId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string uploader = 4;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getUploader = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setUploader = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 from_index = 5;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getFromIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setFromIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 to_index = 6;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getToIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setToIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional string to_key = 7;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getToKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setToKey = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string bundle_summary = 8;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getBundleSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setBundleSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string data_hash = 9;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getDataHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setDataHash = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional FinalizedAt finalized_at = 10;
 * @return {?proto.kyve.bundles.v1beta1.FinalizedAt}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getFinalizedAt = function() {
  return /** @type{?proto.kyve.bundles.v1beta1.FinalizedAt} */ (
    jspb.Message.getWrapperField(this, proto.kyve.bundles.v1beta1.FinalizedAt, 10));
};


/**
 * @param {?proto.kyve.bundles.v1beta1.FinalizedAt|undefined} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
*/
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setFinalizedAt = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.clearFinalizedAt = function() {
  return this.setFinalizedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.hasFinalizedAt = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional string from_key = 11;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getFromKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setFromKey = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional uint32 storage_provider_id = 12;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getStorageProviderId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setStorageProviderId = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint32 compression_id = 13;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.getCompressionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.FinalizedBundle} returns this
 */
proto.kyve.bundles.v1beta1.FinalizedBundle.prototype.setCompressionId = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


