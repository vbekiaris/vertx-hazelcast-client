require 'vertx/util/utils.rb'
# Generated from io.vertx.hazelcast.DistributedObject
module VertxHazelcast
  #  Base interface for all distributed objects.
  # 
  #  All distributed objects are not garbage collectable unless  is called first.
  #  Note: Failure to destroy after you are done using a distributed object will lead to memory leaks.
  class DistributedObject
    # @private
    # @param j_del [::VertxHazelcast::DistributedObject] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxHazelcast::DistributedObject] the underlying java delegate
    def j_del
      @j_del
    end
    #  Returns the key of the partition that this DistributedObject is assigned to. The returned value only has meaning
    #  for a non-partitioned data structure like an {::VertxHazelcast::IAtomicLong}. For a partitioned data structure like an {::VertxHazelcast::IMap},
    #  the returned value will not be null, but otherwise undefined.
    # @return [String] the partition key.
    def get_partition_key
      if !block_given?
        return @j_del.java_method(:getPartitionKey, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling get_partition_key()"
    end
    #  Returns the unique name for this DistributedObject. The returned value will never be null.
    # @return [String] the unique name for this object.
    def get_name
      if !block_given?
        return @j_del.java_method(:getName, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling get_name()"
    end
    #  Returns the service name for this object.
    # @return [String] the service name for this object.
    def get_service_name
      if !block_given?
        return @j_del.java_method(:getServiceName, []).call()
      end
      raise ArgumentError, "Invalid arguments when calling get_service_name()"
    end
    #  Destroys this object cluster-wide.
    #  Clears and releases all resources for this object.
    # @yield 
    # @return [void]
    def destroy
      if block_given?
        return @j_del.java_method(:destroy, [Java::IoVertxCore::Handler.java_class]).call((Proc.new { |ar| yield(ar.failed ? ar.cause : nil) }))
      end
      raise ArgumentError, "Invalid arguments when calling destroy()"
    end
  end
end
