// source: ixo/claims/v1beta1/authz.proto
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

goog.provide('proto.ixo.claims.v1beta1.EvaluateClaimConstraints');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');

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
proto.ixo.claims.v1beta1.EvaluateClaimConstraints = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.claims.v1beta1.EvaluateClaimConstraints.repeatedFields_, null);
};
goog.inherits(proto.ixo.claims.v1beta1.EvaluateClaimConstraints, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.EvaluateClaimConstraints.displayName = 'proto.ixo.claims.v1beta1.EvaluateClaimConstraints';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.repeatedFields_ = [2,10];



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
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.EvaluateClaimConstraints.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.toObject = function(includeInstance, msg) {
  var f, obj = {
    collectionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    claimIdsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    agentQuota: jspb.Message.getFieldWithDefault(msg, 3, 0),
    beforeDate: (f = msg.getBeforeDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    maxCustomAmountList: jspb.Message.toObjectList(msg.getMaxCustomAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.EvaluateClaimConstraints;
  return proto.ixo.claims.v1beta1.EvaluateClaimConstraints.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollectionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addClaimIds(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAgentQuota(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setBeforeDate(value);
      break;
    case 10:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addMaxCustomAmount(value);
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
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.EvaluateClaimConstraints.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCollectionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getClaimIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getAgentQuota();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getBeforeDate();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getMaxCustomAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string collection_id = 1;
 * @return {string}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.getCollectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.setCollectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string claim_ids = 2;
 * @return {!Array<string>}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.getClaimIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.setClaimIdsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.addClaimIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.clearClaimIdsList = function() {
  return this.setClaimIdsList([]);
};


/**
 * optional uint64 agent_quota = 3;
 * @return {number}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.getAgentQuota = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.setAgentQuota = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp before_date = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.getBeforeDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
*/
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.setBeforeDate = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.clearBeforeDate = function() {
  return this.setBeforeDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.hasBeforeDate = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin max_custom_amount = 10;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.getMaxCustomAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 10));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
*/
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.setMaxCustomAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.addMaxCustomAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimConstraints.prototype.clearMaxCustomAmountList = function() {
  return this.setMaxCustomAmountList([]);
};

