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

goog.provide('proto.kyve.bundles.v1beta1.BundleProposal');

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
proto.kyve.bundles.v1beta1.BundleProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.bundles.v1beta1.BundleProposal.repeatedFields_, null);
};
goog.inherits(proto.kyve.bundles.v1beta1.BundleProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.bundles.v1beta1.BundleProposal.displayName = 'proto.kyve.bundles.v1beta1.BundleProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.bundles.v1beta1.BundleProposal.repeatedFields_ = [11,12,13];



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
proto.kyve.bundles.v1beta1.BundleProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.bundles.v1beta1.BundleProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.bundles.v1beta1.BundleProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.BundleProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    storageId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    uploader: jspb.Message.getFieldWithDefault(msg, 3, ""),
    nextUploader: jspb.Message.getFieldWithDefault(msg, 4, ""),
    dataSize: jspb.Message.getFieldWithDefault(msg, 5, 0),
    bundleSize: jspb.Message.getFieldWithDefault(msg, 6, 0),
    toKey: jspb.Message.getFieldWithDefault(msg, 7, ""),
    bundleSummary: jspb.Message.getFieldWithDefault(msg, 8, ""),
    dataHash: jspb.Message.getFieldWithDefault(msg, 9, ""),
    updatedAt: jspb.Message.getFieldWithDefault(msg, 10, 0),
    votersValidList: (f = jspb.Message.getRepeatedField(msg, 11)) == null ? undefined : f,
    votersInvalidList: (f = jspb.Message.getRepeatedField(msg, 12)) == null ? undefined : f,
    votersAbstainList: (f = jspb.Message.getRepeatedField(msg, 13)) == null ? undefined : f,
    fromKey: jspb.Message.getFieldWithDefault(msg, 14, ""),
    storageProviderId: jspb.Message.getFieldWithDefault(msg, 15, 0),
    compressionId: jspb.Message.getFieldWithDefault(msg, 16, 0)
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
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal}
 */
proto.kyve.bundles.v1beta1.BundleProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.bundles.v1beta1.BundleProposal;
  return proto.kyve.bundles.v1beta1.BundleProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.bundles.v1beta1.BundleProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal}
 */
proto.kyve.bundles.v1beta1.BundleProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setStorageId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setUploader(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNextUploader(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDataSize(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBundleSize(value);
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUpdatedAt(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.addVotersValid(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.addVotersInvalid(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.addVotersAbstain(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromKey(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setStorageProviderId(value);
      break;
    case 16:
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
proto.kyve.bundles.v1beta1.BundleProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.bundles.v1beta1.BundleProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.bundles.v1beta1.BundleProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.BundleProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStorageId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUploader();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNextUploader();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDataSize();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getBundleSize();
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
  f = message.getUpdatedAt();
  if (f !== 0) {
    writer.writeUint64(
      10,
      f
    );
  }
  f = message.getVotersValidList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      11,
      f
    );
  }
  f = message.getVotersInvalidList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      12,
      f
    );
  }
  f = message.getVotersAbstainList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      13,
      f
    );
  }
  f = message.getFromKey();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
  f = message.getStorageProviderId();
  if (f !== 0) {
    writer.writeUint32(
      15,
      f
    );
  }
  f = message.getCompressionId();
  if (f !== 0) {
    writer.writeUint32(
      16,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string storage_id = 2;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getStorageId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setStorageId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string uploader = 3;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getUploader = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setUploader = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string next_uploader = 4;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getNextUploader = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setNextUploader = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 data_size = 5;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getDataSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setDataSize = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 bundle_size = 6;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getBundleSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setBundleSize = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional string to_key = 7;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getToKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setToKey = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string bundle_summary = 8;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getBundleSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setBundleSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string data_hash = 9;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getDataHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setDataHash = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional uint64 updated_at = 10;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getUpdatedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setUpdatedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * repeated string voters_valid = 11;
 * @return {!Array<string>}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getVotersValidList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 11));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setVotersValidList = function(value) {
  return jspb.Message.setField(this, 11, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.addVotersValid = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 11, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.clearVotersValidList = function() {
  return this.setVotersValidList([]);
};


/**
 * repeated string voters_invalid = 12;
 * @return {!Array<string>}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getVotersInvalidList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 12));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setVotersInvalidList = function(value) {
  return jspb.Message.setField(this, 12, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.addVotersInvalid = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 12, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.clearVotersInvalidList = function() {
  return this.setVotersInvalidList([]);
};


/**
 * repeated string voters_abstain = 13;
 * @return {!Array<string>}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getVotersAbstainList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 13));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setVotersAbstainList = function(value) {
  return jspb.Message.setField(this, 13, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.addVotersAbstain = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 13, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.clearVotersAbstainList = function() {
  return this.setVotersAbstainList([]);
};


/**
 * optional string from_key = 14;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getFromKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setFromKey = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


/**
 * optional uint32 storage_provider_id = 15;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getStorageProviderId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setStorageProviderId = function(value) {
  return jspb.Message.setProto3IntField(this, 15, value);
};


/**
 * optional uint32 compression_id = 16;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.getCompressionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 16, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.BundleProposal} returns this
 */
proto.kyve.bundles.v1beta1.BundleProposal.prototype.setCompressionId = function(value) {
  return jspb.Message.setProto3IntField(this, 16, value);
};


