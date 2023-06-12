// source: shentu/oracle/v1alpha1/tx.proto
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

goog.provide('proto.shentu.oracle.v1alpha1.MsgCreateTask');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');

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
proto.shentu.oracle.v1alpha1.MsgCreateTask = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.oracle.v1alpha1.MsgCreateTask.repeatedFields_, null);
};
goog.inherits(proto.shentu.oracle.v1alpha1.MsgCreateTask, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.oracle.v1alpha1.MsgCreateTask.displayName = 'proto.shentu.oracle.v1alpha1.MsgCreateTask';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.repeatedFields_ = [3];



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
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.oracle.v1alpha1.MsgCreateTask.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.oracle.v1alpha1.MsgCreateTask} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.toObject = function(includeInstance, msg) {
  var f, obj = {
    contract: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pb_function: jspb.Message.getFieldWithDefault(msg, 2, ""),
    bountyList: jspb.Message.toObjectList(msg.getBountyList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    description: jspb.Message.getFieldWithDefault(msg, 4, ""),
    creator: jspb.Message.getFieldWithDefault(msg, 5, ""),
    wait: jspb.Message.getFieldWithDefault(msg, 6, 0),
    validDuration: (f = msg.getValidDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.oracle.v1alpha1.MsgCreateTask;
  return proto.shentu.oracle.v1alpha1.MsgCreateTask.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.oracle.v1alpha1.MsgCreateTask} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContract(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFunction(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addBounty(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setWait(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setValidDuration(value);
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
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.oracle.v1alpha1.MsgCreateTask.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.oracle.v1alpha1.MsgCreateTask} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFunction();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBountyList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getWait();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getValidDuration();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional string contract = 1;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string function = 2;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getFunction = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setFunction = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin bounty = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getBountyList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
*/
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setBountyList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.addBounty = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.clearBountyList = function() {
  return this.setBountyList([]);
};


/**
 * optional string description = 4;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string creator = 5;
 * @return {string}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 wait = 6;
 * @return {number}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getWait = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setWait = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional google.protobuf.Duration valid_duration = 7;
 * @return {?proto.google.protobuf.Duration}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.getValidDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 7));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
*/
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.setValidDuration = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.oracle.v1alpha1.MsgCreateTask} returns this
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.clearValidDuration = function() {
  return this.setValidDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.oracle.v1alpha1.MsgCreateTask.prototype.hasValidDuration = function() {
  return jspb.Message.getField(this, 7) != null;
};


