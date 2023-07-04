// source: sommelier/cork/v1/tx.proto
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

goog.provide('proto.cork.v1.MsgScheduleCorkRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cork.v1.Cork');

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
proto.cork.v1.MsgScheduleCorkRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cork.v1.MsgScheduleCorkRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cork.v1.MsgScheduleCorkRequest.displayName = 'proto.cork.v1.MsgScheduleCorkRequest';
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
proto.cork.v1.MsgScheduleCorkRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cork.v1.MsgScheduleCorkRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cork.v1.MsgScheduleCorkRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v1.MsgScheduleCorkRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    cork: (f = msg.getCork()) && proto.cork.v1.Cork.toObject(includeInstance, f),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 2, 0),
    signer: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.cork.v1.MsgScheduleCorkRequest}
 */
proto.cork.v1.MsgScheduleCorkRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cork.v1.MsgScheduleCorkRequest;
  return proto.cork.v1.MsgScheduleCorkRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cork.v1.MsgScheduleCorkRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cork.v1.MsgScheduleCorkRequest}
 */
proto.cork.v1.MsgScheduleCorkRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cork.v1.Cork;
      reader.readMessage(value,proto.cork.v1.Cork.deserializeBinaryFromReader);
      msg.setCork(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockHeight(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.cork.v1.MsgScheduleCorkRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cork.v1.MsgScheduleCorkRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cork.v1.MsgScheduleCorkRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v1.MsgScheduleCorkRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCork();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cork.v1.Cork.serializeBinaryToWriter
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional Cork cork = 1;
 * @return {?proto.cork.v1.Cork}
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.getCork = function() {
  return /** @type{?proto.cork.v1.Cork} */ (
    jspb.Message.getWrapperField(this, proto.cork.v1.Cork, 1));
};


/**
 * @param {?proto.cork.v1.Cork|undefined} value
 * @return {!proto.cork.v1.MsgScheduleCorkRequest} returns this
*/
proto.cork.v1.MsgScheduleCorkRequest.prototype.setCork = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cork.v1.MsgScheduleCorkRequest} returns this
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.clearCork = function() {
  return this.setCork(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.hasCork = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional uint64 block_height = 2;
 * @return {number}
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.cork.v1.MsgScheduleCorkRequest} returns this
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string signer = 3;
 * @return {string}
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cork.v1.MsgScheduleCorkRequest} returns this
 */
proto.cork.v1.MsgScheduleCorkRequest.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

