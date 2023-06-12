// source: comdex/vault/v1beta1/query.proto
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

goog.provide('proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

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
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.displayName = 'proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest';
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
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    appId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    extendedPairId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f)
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
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest;
  return proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setExtendedPairId(value);
      break;
    case 3:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
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
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getExtendedPairId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 app_id = 1;
 * @return {number}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} returns this
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 extended_pair_id = 2;
 * @return {number}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.getExtendedPairId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} returns this
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.setExtendedPairId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 3;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 3));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} returns this
*/
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest} returns this
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 3) != null;
};


