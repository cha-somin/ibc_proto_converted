# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kyve.delegation.v1beta1 import query_pb2 as kyve_dot_delegation_dot_v1beta1_dot_query__pb2


class QueryStub(object):
    """*
    Contains the native params query.
    Everything else is provided by the query module. The reason for this
    is that a lot of queries require composite data from all modules.

    Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/kyve.delegation.v1beta1.Query/Params',
                request_serializer=kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
                )


class QueryServicer(object):
    """*
    Contains the native params query.
    Everything else is provided by the query module. The reason for this
    is that a lot of queries require composite data from all modules.

    Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Parameters queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kyve.delegation.v1beta1.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """*
    Contains the native params query.
    Everything else is provided by the query module. The reason for this
    is that a lot of queries require composite data from all modules.

    Query defines the gRPC querier service.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kyve.delegation.v1beta1.Query/Params',
            kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsRequest.SerializeToString,
            kyve_dot_delegation_dot_v1beta1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
