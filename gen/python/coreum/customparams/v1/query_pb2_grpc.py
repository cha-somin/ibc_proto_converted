# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from coreum.customparams.v1 import query_pb2 as coreum_dot_customparams_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.StakingParams = channel.unary_unary(
                '/coreum.customparams.v1.Query/StakingParams',
                request_serializer=coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsRequest.SerializeToString,
                response_deserializer=coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def StakingParams(self, request, context):
        """StakingParams queries the staking parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'StakingParams': grpc.unary_unary_rpc_method_handler(
                    servicer.StakingParams,
                    request_deserializer=coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsRequest.FromString,
                    response_serializer=coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'coreum.customparams.v1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def StakingParams(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/coreum.customparams.v1.Query/StakingParams',
            coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsRequest.SerializeToString,
            coreum_dot_customparams_dot_v1_dot_query__pb2.QueryStakingParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
