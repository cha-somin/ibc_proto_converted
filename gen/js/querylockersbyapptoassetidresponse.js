// source: comdex/locker/v1beta1/query.proto
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

goog.provide('proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.displayName = 'proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.repeatedFields_ = [1];



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
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    lockerIdsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
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
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse}
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse;
  return proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse}
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addLockerIds(values[i]);
      }
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
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLockerIdsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      1,
      f
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
 * repeated uint64 locker_ids = 1;
 * @return {!Array<number>}
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.getLockerIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.setLockerIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.addLockerIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.clearLockerIdsList = function() {
  return this.setLockerIdsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} returns this
*/
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


