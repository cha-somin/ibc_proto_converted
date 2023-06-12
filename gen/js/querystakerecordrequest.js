// source: stafihub/mining/query.proto
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

goog.provide('proto.stafihub.stafihub.mining.QueryStakeRecordRequest');

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
proto.stafihub.stafihub.mining.QueryStakeRecordRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.mining.QueryStakeRecordRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.mining.QueryStakeRecordRequest.displayName = 'proto.stafihub.stafihub.mining.QueryStakeRecordRequest';
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
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.mining.QueryStakeRecordRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    useraddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    stakepoolindex: jspb.Message.getFieldWithDefault(msg, 2, 0),
    stakerecordindex: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest}
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.mining.QueryStakeRecordRequest;
  return proto.stafihub.stafihub.mining.QueryStakeRecordRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest}
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUseraddress(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setStakepoolindex(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setStakerecordindex(value);
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
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.mining.QueryStakeRecordRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUseraddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getStakepoolindex();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getStakerecordindex();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
};


/**
 * optional string userAddress = 1;
 * @return {string}
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.getUseraddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} returns this
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.setUseraddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 stakePoolIndex = 2;
 * @return {number}
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.getStakepoolindex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} returns this
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.setStakepoolindex = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 stakeRecordIndex = 3;
 * @return {number}
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.getStakerecordindex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.mining.QueryStakeRecordRequest} returns this
 */
proto.stafihub.stafihub.mining.QueryStakeRecordRequest.prototype.setStakerecordindex = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


